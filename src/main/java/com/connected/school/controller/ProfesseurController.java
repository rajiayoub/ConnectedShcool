package com.connected.school.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.ProfesseurDTO;
import com.connected.school.service.IProfesseurService;
import com.connectedshcool.extensions.ajax.JsonResponse;

@Controller
@RequestMapping("/professeur")
/**
 *
 * @author KHTIFOU SAAD
 */
public class ProfesseurController extends ConnectedSchoolController<ProfesseurDTO>{

	private static final Logger LOGGER = LoggerFactory
	.getLogger(ProfesseurController.class);

	protected static final String MODEL_NAME = "professeur";
	
	@Resource
	private IProfesseurService professeurService;
	
	public void setProfesseurService(
			IProfesseurService professeurService) {
		this.professeurService = professeurService;
	}
	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	@Override
	public void showList(Model model) {
		model.addAttribute("professeurs", professeurService.findAll()) ;
	}
	
	@Override
	protected void processCreate(ProfesseurDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create professeur form was submitted with information: " + objectToCreate);
        professeurService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}
	
}
