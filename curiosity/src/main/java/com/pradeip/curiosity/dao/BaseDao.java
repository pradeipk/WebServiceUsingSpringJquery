package com.pradeip.curiosity.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author pradeep_patel
 *
 * @param <PK>
 * @param <T>
 *            Performs Generic CRUD that do not need specialized handling. All
 *            Dao should extend this class and at the same time implement
 *            Interfaces
 */
public abstract class BaseDao<PK extends Serializable, T> {

	public final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public BaseDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
	}

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() throws Exception {
		try {
			return sessionFactory.getCurrentSession();
		} catch (Exception e) {
			throw e;
		}

	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) throws Exception {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) throws Exception {
		getSession().persist(entity);

	}

	public void update(T entity) throws Exception {
		getSession().update(entity);

	}

	public void delete(T entity) throws Exception {
		getSession().delete(entity);
	}

	protected Criteria createEntityCriteria() throws Exception {
		return getSession().createCriteria(persistentClass);
	}

}
