package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IVilleDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Ville;

@Repository
public class VilleDao extends AbstractHibernateDao<Ville>implements IVilleDao {

	public VilleDao() {
		
        super();
        setClazz(Ville.class);
    }
	
}
