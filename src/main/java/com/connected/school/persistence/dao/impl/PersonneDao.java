package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IPersonneDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Personne;

@Repository
public class PersonneDao extends AbstractHibernateDao<Personne>implements IPersonneDao {

	public PersonneDao() {
        super();
        setClazz(Personne.class);
    }
	
}
