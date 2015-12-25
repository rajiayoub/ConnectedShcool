package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.ITuteurDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Tuteur;

@Repository
public class TuteurDao extends AbstractHibernateDao<Tuteur>implements ITuteurDao {

	public TuteurDao() {
        super();
        setClazz(Tuteur.class);
    }
}
