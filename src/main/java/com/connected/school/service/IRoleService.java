package com.connected.school.service;

import java.util.List;

import com.connected.school.dto.RoleDTO;
import com.connected.school.persistence.model.Role;

public interface IRoleService {
	 public Role delete(Long Id) throws Exception;
	 
		/**
	     * Creates a new person.
	     * @param created   The information of the created person.
	     * @return  The created person.
	     */
	    public Role create(RoleDTO created);


	    /**
	     * Finds all persons.
	     * @return  A list of persons.
	     */
	    public List<Role> findAll();

	    /**
	     * Finds person by id.
	     * @param id    The id of the wanted person.
	     * @return  The found person. If no person is found, this method returns null.
	     */
	    public Role findById(Long id);

	    /**
	     * Searches persons by using the given search term as a parameter.
	     * @param searchTerm
	     * @return  A list of persons whose last name begins with the given search term. If no persons is found, this method
	     *          returns an empty list. This search is case insensitive.
	     */
	    public List<Role> search(String searchTerm);

	    /**
	     * Updates the information of a person.
	     * @param updated   The information of the updated person.
	     * @return  The updated person.
	     * @throws PersonNotFoundException  if no person is found with given id.
	     */
	    public Role update(RoleDTO updated) throws Exception;	
	
}
