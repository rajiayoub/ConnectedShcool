package com.connected.school.controller.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.connected.school.dto.AbstractDTO;
import com.connectedshcool.extensions.ajax.AjaxUtils;
import com.connectedshcool.extensions.ajax.ErrorMessage;
import com.connectedshcool.extensions.ajax.JsonResponse;

/**
 * An abstract controller class which provides utility methods useful to actual
 * controller classes.
 * 
 * @author KHTIFOU SAAD
 */
@Controller
public abstract class ConnectedSchoolController<T> {

	protected static final Logger LOGGER = LoggerFactory
			.getLogger(ConnectedSchoolController.class);

	protected static final String FLASH_ERROR_MESSAGE = "errorMessage";
	protected static final String FLASH_FEEDBACK_MESSAGE = "feedbackMessage";

	protected static final String VIEW_REDIRECT_PREFIX = "redirect:";

	protected static final String ERROR_MESSAGE_KEY_DELETED_WAS_NOT_FOUND = "error.message.deleted.not.found";
	protected static final String ERROR_MESSAGE_KEY_EDITED_WAS_NOT_FOUND = "error.message.edited.not.found";

	protected static final String FEEDBACK_MESSAGE_KEY_CREATED = "feedback.message.created";
	protected static final String FEEDBACK_MESSAGE_KEY_DELETED = "feedback.message.deleted";
	protected static final String FEEDBACK_MESSAGE_KEY_EDITED = "feedback.message.edited";

	protected static final String ADD_FORM_VIEW = "/create";
	protected static final String EDIT_FORM_VIEW = "/edit";
	protected static final String LIST_VIEW = "/list";
	protected static final String SEARCH_RESULT_VIEW = "/searchResults";

	protected static final String REQUEST_MAPPING_HOME = "/home";

	@ModelAttribute
	public void ajaxAttribute(WebRequest request, Model model) {
		model.addAttribute("ajaxRequest", AjaxUtils.isAjaxRequest(request));
	}

	@ModelAttribute
	public void createResponseObject(Model model) {
		model.addAttribute("response", new JsonResponse());
	}

	@Resource
	private MessageSource messageSource;

	/**
	 * Adds a new error message
	 * 
	 * @param model
	 *            A model which stores the the error message.
	 * @param code
	 *            A message code which is used to fetch the correct message from
	 *            the message source.
	 * @param params
	 *            The parameters attached to the actual error message.
	 */
	public void addErrorMessage(BindingResult bindingResult,
			JsonResponse response) {
		LOGGER.debug("adding error message");
		Locale current = LocaleContextHolder.getLocale();
		LOGGER.debug("Current locale is " + current);
		response.setStatus(Boolean.FALSE);
		List<FieldError> allErrors = bindingResult.getFieldErrors();
		List<ErrorMessage> errorMesages = new ArrayList<ErrorMessage>();
		for (FieldError objectError : allErrors) {
			String localizedErrorMessage = messageSource.getMessage(
					objectError.getDefaultMessage(), null, current);
			errorMesages.add(new ErrorMessage(objectError.getField(),
					objectError.getField() + "  " + localizedErrorMessage));
		}
		response.setErrorMessageList(errorMesages);
	}

	/**
	 * Adds a new feedback message.
	 * 
	 * @param model
	 *            A model which stores the feedback message.
	 * @param code
	 *            A message code which is used to fetch the actual message from
	 *            the message source.
	 * @param params
	 *            The parameters which are attached to the actual feedback
	 *            message.
	 */
	public void addFeedbackMessage(BindingResult bindingResult,
			JsonResponse response, String codeMessage) {
		Locale current = LocaleContextHolder.getLocale();
		LOGGER.debug("Current locale is " + current);
		String localizedFeedbackMessage = messageSource.getMessage(codeMessage,
				null, current);
		response.setStatus(true);
		response.setSuccessMessage(localizedFeedbackMessage);
		LOGGER.debug("Localized message is: " + localizedFeedbackMessage);
	}

	/**
	 * Creates a redirect view path for a specific controller action
	 * 
	 * @param path
	 *            The path processed by the controller method.
	 * @return A redirect view path to the given controller method.
	 */
	public String createRedirectViewPath(String path) {
		StringBuilder builder = new StringBuilder();
		builder.append(modelName());
		builder.append(path);
		return builder.toString();
	}

	/**
	 * This method should only be used by unit tests.
	 * 
	 * @param messageSource
	 */
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * Creates a redirect view path for a specific controller action
	 * 
	 * @param path
	 *            The path processed by the controller method.
	 * @return A redirect view path to the given controller method.
	 */
	protected String modelName() {
		return null;
	}

	/**
	 * Creates a redirect view path for a specific controller action
	 * 
	 * @param path
	 *            The path processed by the controller method.
	 * @return A redirect view path to the given controller method.
	 */
	protected String modelNameDTO() {
		return null;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public JsonResponse submitEditPersonForm(
			@Valid @ModelAttribute T objectToCreate,
			BindingResult bindingResult, JsonResponse response) {
		LOGGER.debug("Edit person form was submitted with information: "
				+ objectToCreate);
		if (bindingResult.hasErrors()) {
			addErrorMessage(bindingResult, response);
			return response;
		}
		processCreate(objectToCreate, response);
		addFeedbackMessage(bindingResult, response,
				FEEDBACK_MESSAGE_KEY_CREATED);
		return response;
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String showCreatePersonForm(Model model) {
		LOGGER.debug("Rendering create person form");
		model.addAttribute(modelName(), new AbstractDTO());
		return createRedirectViewPath(ADD_FORM_VIEW);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void showList(Model model) {
		LOGGER.debug("Rendering list elements ");
	}

	protected void processCreate(T objectToCreate, JsonResponse response) {

	}

}
