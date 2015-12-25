package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IProfilDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Profil;

@Repository
public class ProfilDao extends AbstractHibernateDao<Profil>implements IProfilDao {

	public ProfilDao() {
        super();
        setClazz(Profil.class);
    }
}
