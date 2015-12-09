package com.connected.school.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.PrivilegeDTO;
import com.connected.school.service.IPrivilegeService;
import com.connectedshcool.extensions.ajax.JsonResponse;

@Controller
@RequestMapping("/privilege")
public  class PrivilegeController extends ConnectedSchoolController<PrivilegeDTO> {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PrivilegeController.class);

	protected static final String MODEL_NAME = "privilege";
	@Resource
	private IPrivilegeService privilegeService;

	public void setPrivilegeService(
			IPrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("privileges", privilegeService.findAll()) ;
	}

	@Override
	protected void processCreate(PrivilegeDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create Privilege form was submitted with information: " + objectToCreate);
        privilegeService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}

	
}
