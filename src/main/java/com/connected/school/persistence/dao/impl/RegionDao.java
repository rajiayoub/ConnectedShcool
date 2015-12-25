package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IRegionDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.Region;

@Repository
public class RegionDao extends AbstractHibernateDao<Region>implements IRegionDao {

	public RegionDao() {
        super();
        setClazz(Region.class);
    }
}
