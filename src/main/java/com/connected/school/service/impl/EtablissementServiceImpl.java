package com.connected.school.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.connected.school.dto.EtablissementDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Etablissement;
import com.connected.school.service.IEtablissementService;

@Service
public class EtablissementServiceImpl implements IEtablissementService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(EtablissementServiceImpl.class);


	@Resource
    private IOperations<Etablissement> dao;
	
	
	public void setDao(IOperations<Etablissement> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Etablissement create(EtablissementDTO created) {
		Etablissement e = new Etablissement();
		e.setName(created.getName());
		e.setAdresse(created.getAdresse());
		dao.create(e);
		return e;
	}

	@Override
	public Etablissement delete(Long personId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Etablissement> findAll() {
        LOGGER.debug("Finding all Etablissements");
		List<Etablissement> results = dao.findAll();
        LOGGER.debug("Finding all Etablissements :"+results.size());

		return results;
	}

	@Override
	public Etablissement findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etablissement> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etablissement update(EtablissementDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
