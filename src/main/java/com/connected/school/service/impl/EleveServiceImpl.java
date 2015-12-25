package com.connected.school.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.connected.school.dto.EleveDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Eleve;
import com.connected.school.service.IEleveService;

@Service
public class EleveServiceImpl implements IEleveService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(EleveServiceImpl.class);


	@Resource
    private IOperations<Eleve> dao;
	
	
	public void setDao(IOperations<Eleve> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Eleve create(EleveDTO created) {
		Eleve ele = new Eleve();
		ele.setCodeEleve(created.getCodeEleve());
		ele.setCodeNationalEtudiant(created.getCodeNationalEtudiant());
		dao.create(ele);
		return ele;
	}

	@Override
	public Eleve delete(Long personId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Eleve> findAll() {
        LOGGER.debug("Finding all Eleves");
		List<Eleve> results = dao.findAll();
        LOGGER.debug("Finding all Eleves :"+results.size());

		return results;
	}

	@Override
	public Eleve findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Eleve> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eleve update(EleveDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
