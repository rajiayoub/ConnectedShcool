package com.connected.school.service;

import java.util.List;

import com.connected.school.dto.RegionDTO;
import com.connected.school.persistence.model.Region;

public interface IRegionService {
	public Region create(RegionDTO created);

    /**
     * Deletes a person.
     * @param personId  The id of the deleted person.
     * @return  The deleted person.
     * @throws PersonNotFoundException  if no person is found with the given id.
     */
    public Region delete(Long personId) throws Exception;

    /**
     * Finds all persons.
     * @return  A list of persons.
     */
    public List<Region> findAll();

    /**
     * Finds person by id.
     * @param id    The id of the wanted person.
     * @return  The found person. If no person is found, this method returns null.
     */
    public Region findById(Long id);

    /**
     * Searches persons by using the given search term as a parameter.
     * @param searchTerm
     * @return  A list of persons whose last name begins with the given search term. If no persons is found, this method
     *          returns an empty list. This search is case insensitive.
     */
    public List<Region> search(String searchTerm);

    /**
     * Updates the information of a person.
     * @param updated   The information of the updated person.
     * @return  The updated person.
     * @throws PersonNotFoundException  if no person is found with given id.
     */
    public Region update(RegionDTO updated) throws Exception;	
	
}
