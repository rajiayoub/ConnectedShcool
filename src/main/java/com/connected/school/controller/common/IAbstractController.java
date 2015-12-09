package com.connected.school.controller.common;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface IAbstractController{

	 /**
     * Processes delete  requests.
     * @param id    The id of the deleted .
     * @param attributes
     * @return
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void delete(@PathVariable("id") Long id, RedirectAttributes attributes);

    /**
     * Processes search  requests.
     * @param searchCriteria    The search criteria.
     * @param model
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public void search(Model model);
    
    /**
     * Processes create  requests.
     * @param model
     * @return  The name of the create  form view.
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET) 
    public void showCreateForm(Model model);

    /**
     * Processes the submissions of create  form.
     * @param created   The information of the created .
     * @param bindingResult
     * @param attributes
     * @return
     */
    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public void submitCreateForm(Model model);

    /**
     * Processes edit  requests.
     * @param id    The id of the edited .
     * @param model
     * @param attributes
     * @return  The name of the edit  form view.
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public void showEditForm(@PathVariable("id") Long id, Model model, RedirectAttributes attributes);
    /**
     * Processes the submissions of edit  form.
     * @param updated   The information of the edited .
     * @param bindingResult
     * @param attributes
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public void submitEditForm( BindingResult bindingResult, RedirectAttributes attributes);
    
   
    /**
     * Processes requests to home page which lists all available persons.
     * @param model
     * @return  The name of the person list view.
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public void showList(Model model);

    
	
}
