package com.connected.school.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.connected.school.persistence.dao.IPersonnelAdministratifDao;
import com.connected.school.persistence.dao.common.AbstractHibernateDao;
import com.connected.school.persistence.model.PersonnelAdministratif;
/**
 * @author Mohsine
 *
 */
@Repository
public  class PersonnelAdministratifDao extends AbstractHibernateDao<PersonnelAdministratif>implements IPersonnelAdministratifDao{

	 
	
		public PersonnelAdministratifDao() {
	        super();
	        setClazz(PersonnelAdministratif.class);
	    }

	
	
}
