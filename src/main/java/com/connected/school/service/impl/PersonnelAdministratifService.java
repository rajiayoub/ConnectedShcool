package com.connected.school.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connected.school.dto.PersonnelAdministratifDTO;
import com.connected.school.persistence.dao.IPersonnelAdministratifDao;
import com.connected.school.persistence.model.PersonnelAdministratif;
import com.connected.school.service.IPersonnelAdministratifService;

@Service
public class PersonnelAdministratifService implements IPersonnelAdministratifService  {

	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(PersonnelAdministratifService.class);

	
	@Autowired
	private IPersonnelAdministratifDao personnelAdministratifDao;
	

	public void setPersonnelAdministratifDao(IPersonnelAdministratifDao personnelAdministratifDao) {
		this.personnelAdministratifDao = personnelAdministratifDao;
	}

	@Override
	@Transactional
	public List<PersonnelAdministratif> findAll() {
		LOGGER.debug("Recherche personnelAdministratifs Service");
		return personnelAdministratifDao.findAll();
	}

	@Override
	@Transactional
	public PersonnelAdministratif create(PersonnelAdministratifDTO personnelAdministratifdto) {
		PersonnelAdministratif p = new PersonnelAdministratif();
		p.setService(personnelAdministratifdto.getService());
		
	    personnelAdministratifDao.create(p);
	    return p;
	}

}
