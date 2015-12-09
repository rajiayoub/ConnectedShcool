package com.connected.school.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.EtablissementDTO;
import com.connected.school.service.IEtablissementService;
import com.connectedshcool.extensions.ajax.JsonResponse;

/**
 * @author KHTIFOU SAAD
 */
@Controller
@RequestMapping("/etablissement")
public class EtablissementController extends
		ConnectedSchoolController<EtablissementDTO> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(EtablissementController.class);

	protected static final String MODEL_NAME = "etablissement";
	@Resource
	private IEtablissementService etablissementService;

	public void setEtablissementService(
			IEtablissementService etablissementService) {
		this.etablissementService = etablissementService;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("etablissements", etablissementService.findAll()) ;
	}

	@Override
	protected void processCreate(EtablissementDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create etablissement form was submitted with information: " + objectToCreate);
		etablissementService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}

	

}
