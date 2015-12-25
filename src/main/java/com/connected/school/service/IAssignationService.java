package com.connected.school.service;

import java.util.List;

import com.connected.school.dto.PersonneDTO;
import com.connected.school.persistence.model.Assignation;


public interface IAssignationService {
   /**
     * Finds all persons.
     * @return  A list of persons.
     */
	public List<Assignation> findAll();
	
	public Assignation create(PersonneDTO personedto);
}
