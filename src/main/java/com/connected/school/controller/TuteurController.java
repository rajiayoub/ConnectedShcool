package com.connected.school.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.connected.school.controller.common.ConnectedSchoolController;
import com.connected.school.dto.TuteurDTO;
import com.connected.school.service.ITuteurService;
import com.connectedshcool.extensions.ajax.JsonResponse;


@Controller
@RequestMapping("/tuteur")
public class TuteurController extends
		ConnectedSchoolController<TuteurDTO> {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(TuteurController.class);

	protected static final String MODEL_NAME = "tuteur";
	
	@Resource
	private ITuteurService tuteurService;

	public void setTuteurService(
			ITuteurService tuteurService) {
		this.tuteurService = tuteurService ;
	}

	@Override
	protected String modelName() {
		return MODEL_NAME;
	}
	
	@Override
	public void showList(Model model) {
		model.addAttribute("tuteurs", tuteurService.findAll()) ;
	}

	@Override
	protected void processCreate(TuteurDTO objectToCreate,
			JsonResponse response) {
        LOGGER.debug("Create etablissement form was submitted with information: " + objectToCreate);
        tuteurService.create(objectToCreate);
		response.setRedirectUrl(createRedirectViewPath(LIST_VIEW));
	}
}
