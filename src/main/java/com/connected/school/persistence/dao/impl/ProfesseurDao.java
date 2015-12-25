package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IProfesseurDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Professeur;

@Repository
public class ProfesseurDao extends AbstractHibernateDao<Professeur>implements IProfesseurDao {

	public ProfesseurDao() {
        super();
        setClazz(Professeur.class);
    }
}
