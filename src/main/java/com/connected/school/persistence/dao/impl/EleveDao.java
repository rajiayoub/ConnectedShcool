package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IEleveDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Eleve;

@Repository
public class EleveDao extends AbstractHibernateDao<Eleve>implements IEleveDao {

	public EleveDao() {
        super();
        setClazz(Eleve.class);
    }
}
