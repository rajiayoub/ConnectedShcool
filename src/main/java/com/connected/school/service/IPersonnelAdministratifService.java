/**
 * 
 */
package com.connected.school.service;
import java.util.List;

import com.connected.school.dto.PersonnelAdministratifDTO;
import com.connected.school.persistence.model.PersonnelAdministratif;
/**
 * @author Mohsine
 *
 */
public interface IPersonnelAdministratifService {
	public List<PersonnelAdministratif> findAll();
	
	public PersonnelAdministratif create(PersonnelAdministratifDTO personnelAdministratifDto);
}
