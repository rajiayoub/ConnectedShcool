package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IAffectationDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Affectation;

@Repository
public class AffectationDao extends AbstractHibernateDao<Affectation>implements IAffectationDao {

	public AffectationDao() {
        super();
        setClazz(Affectation.class);
    }
}
