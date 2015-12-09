package com.connected.school.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.connected.school.dto.RoleDTO;
import com.connected.school.persistence.dao.common.IOperations;
import com.connected.school.persistence.model.Role;
import com.connected.school.service.IRoleService;


@Service
public class RoleService implements IRoleService {

	private static final Logger LOGGER = LoggerFactory
	.getLogger(RoleService.class);

	
	@Resource
    private IOperations<Role> dao;
	
	
	public void setDao(IOperations<Role> dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public Role create(RoleDTO created) {
		Role e = new Role();
		e.setLibelleRole(created.getLibelleRole());
		dao.create(e);
		return e;
	}

	@Override
	public Role delete(Long Id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Role> findAll() {
        LOGGER.debug("Finding all Roles");
		List<Role> results = dao.findAll();
        LOGGER.debug("Finding all Roles :"+results.size());

		return results;
	}

	@Override
	public Role findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> search(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role update(RoleDTO updated) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}