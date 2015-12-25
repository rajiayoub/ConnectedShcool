package com.connected.school.service;

import java.util.List;

import com.connected.school.dto.EleveDTO;
import com.connected.school.persistence.model.Eleve;

public interface IEleveService {

	/**
     * Creates a new person.
     * @param created   The information of the created person.
     * @return  The created person.
     */
    public Eleve create(EleveDTO created);

    /**
     * Deletes a person.
     * @param personId  The id of the deleted person.
     * @return  The deleted person.
     * @throws PersonNotFoundException  if no person is found with the given id.
     */
    public Eleve delete(Long personId) throws Exception;

    /**
     * Finds all persons.
     * @return  A list of persons.
     */
    public List<Eleve> findAll();

    /**
     * Finds person by id.
     * @param id    The id of the wanted person.
     * @return  The found person. If no person is found, this method returns null.
     */
    public Eleve findById(Long id);

    /**
     * Searches persons by using the given search term as a parameter.
     * @param searchTerm
     * @return  A list of persons whose last name begins with the given search term. If no persons is found, this method
     *          returns an empty list. This search is case insensitive.
     */
    public List<Eleve> search(String searchTerm);

    /**
     * Updates the information of a person.
     * @param updated   The information of the updated person.
     * @return  The updated person.
     * @throws PersonNotFoundException  if no person is found with given id.
     */
    public Eleve update(EleveDTO updated) throws Exception;
}
