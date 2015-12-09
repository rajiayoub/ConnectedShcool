package com.connected.school.service;

import java.util.List;

import com.connected.school.dto.PersonneDTO;
import com.connected.school.persistence.model.Personne;

public interface IPersonneService {
   /**
     * Finds all persons.
     * @return  A list of persons.
     */
	public List<Personne> findAll();
	
	public Personne create(PersonneDTO personedto);
}
