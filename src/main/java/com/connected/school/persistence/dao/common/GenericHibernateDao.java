package com.connected.school.persistence.dao.common;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericHibernateDao<T extends Serializable> extends AbstractHibernateDao<T>implements IGenericDao<T> {
    //
}
