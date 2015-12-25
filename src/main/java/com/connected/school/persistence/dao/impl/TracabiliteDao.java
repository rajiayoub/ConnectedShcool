package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.ITracabiliteDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Tracabilite;

@Repository
public class TracabiliteDao extends AbstractHibernateDao<Tracabilite>implements ITracabiliteDao {

	public TracabiliteDao() {
        super();
        setClazz(Tracabilite.class);
    }
}
