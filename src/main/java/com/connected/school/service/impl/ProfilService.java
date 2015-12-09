package com.connected.school.service.impl;

import java.util.List;


import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.connected.school.dto.ProfilDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Profil;
import com.connected.school.service.IProfilService;

@Service
public class ProfilService implements IProfilService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(ProfilService.class);

	
	@Resource
    private IOperations<Profil> dao;
	
	
	public void setDao(IOperations<Profil> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Profil create(ProfilDTO created) {
		Profil e = new Profil();
		e.setLoginUser(created.getLoginUser());
		dao.create(e);
		return e;
	}

	@Override
	public Profil delete(Long Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Profil> findAll() {
        LOGGER.debug("Finding all Profils");
		List<Profil> results = dao.findAll();
        LOGGER.debug("Finding all Profils :"+results.size());

		return results;
	}

	@Override
	public Profil findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profil> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profil update(ProfilDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}