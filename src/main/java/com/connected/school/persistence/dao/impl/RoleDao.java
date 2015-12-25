package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IRoleDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Role;

@Repository
public class RoleDao extends AbstractHibernateDao<Role>implements IRoleDao{

	public RoleDao() {
        super();
        setClazz(Role.class);
    }
}
