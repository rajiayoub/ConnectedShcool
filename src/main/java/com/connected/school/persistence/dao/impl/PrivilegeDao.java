
package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IPrivilegeDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Privilege;

@Repository
public class PrivilegeDao extends AbstractHibernateDao<Privilege>implements IPrivilegeDao {

	public PrivilegeDao() {
        super();
        setClazz(Privilege.class);
    }
}
