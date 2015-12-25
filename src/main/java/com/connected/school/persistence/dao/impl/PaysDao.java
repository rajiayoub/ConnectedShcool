package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IPaysDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Pays;

@Repository
public class PaysDao extends AbstractHibernateDao<Pays>implements IPaysDao {

	public PaysDao() {
        super();
        setClazz(Pays.class);
    }
}
