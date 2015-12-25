package com.connected.school.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.EleveDTO;
import com.connected.school.service.IEleveService;
import com.connectedshcool.extensions.ajax.JsonResponse;


@Controller
@RequestMapping("/eleve")
public class EleveController extends
		ConnectedSchoolController<EleveDTO> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EleveController.class);

	protected static final String MODEL_NAME = "eleve";
	
	@Resource
	private IEleveService eleveService;

	public void setEleveService(
			IEleveService eleveService) {
		this.eleveService = eleveService;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("eleves", eleveService.findAll()) ;
	}

	@Override
	protected void processCreate(EleveDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create eleve form was submitted with information: " + objectToCreate);
		eleveService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}
}
