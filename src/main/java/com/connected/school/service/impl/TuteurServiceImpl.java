package com.connected.school.service.impl;

import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.connected.school.dto.TuteurDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Tuteur;

import com.connected.school.service.ITuteurService;

@Service
public class TuteurServiceImpl implements ITuteurService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(TuteurServiceImpl.class);


	@Resource
    private IOperations<Tuteur> dao;
	
	
	public void setDao(IOperations<Tuteur> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Tuteur create(TuteurDTO created) {
		Tuteur tut = new Tuteur();
		tut.setCin(created.getCin());
		tut.setProfession(created.getProfession());
		
		dao.create(tut);
		return tut;
	}

	@Override
	public Tuteur delete(Long personId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Tuteur> findAll() {
        LOGGER.debug("Finding all tuteurs");
		List<Tuteur> results = dao.findAll();
        LOGGER.debug("Finding all Etablissements :"+results.size());

		return results;
	}

	@Override
	public Tuteur findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tuteur> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuteur update(TuteurDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
