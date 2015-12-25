package com.connected.school.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connected.school.dto.PersonneDTO;
import com.connected.school.persistence.dao.IPersonneDao;
import com.connected.school.persistence.model.Personne;
import com.connected.school.service.IPersonneService;

@Service
public class PersonneService implements IPersonneService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(PersonneService.class);

	@Autowired
	private IPersonneDao personneDao;
	

	public void setPersonneDao(IPersonneDao personneDao) {
		this.personneDao = personneDao;
	}

	@Override
	@Transactional
	public List<Personne> findAll() {
		LOGGER.debug("Recherche personnes Service");
		return personneDao.findAll();
	}

	@Override
	@Transactional
	public Personne create(PersonneDTO personedto) {
		Personne p = new Personne();
		p.setFirstname(personedto.getFirstname());
		p.setLastname(personedto.getLastname());
	    personneDao.create(p);
	    return p;
	}

}
