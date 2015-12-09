package com.connected.school.controller;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.PersonnelAdministratifDTO;
import com.connected.school.service.IPersonnelAdministratifService;
import com.connectedshcool.extensions.ajax.JsonResponse;


@Controller
@RequestMapping("/personnelAdministratif")
public  class PersonnelAdministratifController extends
ConnectedSchoolController<PersonnelAdministratifDTO> {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PersonnelAdministratifController.class);

	protected static final String MODEL_NAME = "personnelAdministratif";
	@Resource
	private IPersonnelAdministratifService personnelAdministratifService;

	public void setPersonnelAdministratifService(
			IPersonnelAdministratifService personnelAdministratifService) {
		this.personnelAdministratifService = personnelAdministratifService;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("personnelAdministratifs", personnelAdministratifService.findAll()) ;
	}

	@Override
	protected void processCreate(PersonnelAdministratifDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create PersonnelAdministratif form was submitted with information: " + objectToCreate);
        personnelAdministratifService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}

	
}