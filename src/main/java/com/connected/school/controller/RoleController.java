package com.connected.school.controller;


import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.RoleDTO;
import com.connected.school.service.IRoleService;
import com.connectedshcool.extensions.ajax.JsonResponse;


@Controller
@RequestMapping("/role")
public  class RoleController extends
ConnectedSchoolController<RoleDTO> {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(RoleController.class);

	protected static final String MODEL_NAME = "role";
	@Resource
	private IRoleService roleService;

	public void setRoleService(
			IRoleService roleService) {
		this.roleService = roleService;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("roles", roleService.findAll()) ;
	}

	@Override
	protected void processCreate(RoleDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create Role form was submitted with information: " + objectToCreate);
        roleService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}

	
}
