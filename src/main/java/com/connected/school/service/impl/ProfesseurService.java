package com.connected.school.service.impl;

import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.connected.school.dto.ProfesseurDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Professeur;
import com.connected.school.service.IProfesseurService;


@Service
public class ProfesseurService implements IProfesseurService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(ProfesseurService.class);


	@Resource
    private IOperations<Professeur> dao;
	
	
	public void setDao(IOperations<Professeur> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Professeur create(ProfesseurDTO created) {
		Professeur prof = new Professeur();
		prof.setMatricule(created.getMatricule());
		prof.setPermanent(created.getPermanent());
		prof.setFirstname(created.getFirstName());
		
		dao.create(prof);
		return prof;
	}

	@Override
	public Professeur delete(Long personId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Professeur> findAll() {
        LOGGER.debug("Finding all Professeurs");
		List<Professeur> results = dao.findAll();
        LOGGER.debug("Finding all Professeurs :"+results.size());

		return results;
	}

	@Override
	public Professeur findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professeur> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professeur update(ProfesseurDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
