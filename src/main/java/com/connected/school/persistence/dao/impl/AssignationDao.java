package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;


import com.connected.school.persistence.dao.IAssignationDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Assignation;

@Repository
public class AssignationDao extends AbstractHibernateDao<Assignation>implements IAssignationDao {

	public AssignationDao() {
        super();
        setClazz(Assignation.class);
    }
}
