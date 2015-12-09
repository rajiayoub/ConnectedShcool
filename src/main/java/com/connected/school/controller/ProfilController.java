package com.connected.school.controller;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.ProfilDTO;
import com.connected.school.service.IProfilService;
import com.connectedshcool.extensions.ajax.JsonResponse;

@Controller
@RequestMapping("/profil")
public  class ProfilController extends
ConnectedSchoolController<ProfilDTO> {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ProfilController.class);

	protected static final String MODEL_NAME = "profil";
	@Resource
	private IProfilService profilService;

	public void setProfilService(
			IProfilService profilService) {
		this.profilService = profilService;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("profils", profilService.findAll()) ;
	}

	@Override
	protected void processCreate(ProfilDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create Profil form was submitted with information: " + objectToCreate);
        profilService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}

	
}
