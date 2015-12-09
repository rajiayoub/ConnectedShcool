package com.connected.school.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.connected.school.dto.PrivilegeDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Privilege;
import com.connected.school.service.IPrivilegeService;

@Service
public class PrivilegeService implements IPrivilegeService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(PrivilegeService.class);

	
	@Resource
    private IOperations<Privilege> dao;
	
	
	public void setDao(IOperations<Privilege> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Privilege create(PrivilegeDTO created) {
		Privilege e = new Privilege();
		e.setLibellePrivilege(created.getLibellePrivilege());
		dao.create(e);
		return e;
	}

	@Override
	public Privilege delete(Long Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Privilege> findAll() {
        LOGGER.debug("Finding all Privileges");
		List<Privilege> results = dao.findAll();
        LOGGER.debug("Finding all Privileges :"+results.size());

		return results;
	}

	@Override
	public Privilege findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilege> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Privilege update(PrivilegeDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}