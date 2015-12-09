package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IEtablissementDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Etablissement;

@Repository
public class EtablissementDao extends AbstractHibernateDao<Etablissement>implements IEtablissementDao {

	public EtablissementDao() {
        super();
        setClazz(Etablissement.class);
    }
}
