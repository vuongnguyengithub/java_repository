package com.java_ee_sample.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class BaseDaoImpl<T>  implements BaseDao<T>{
	
	@PersistenceContext(name="myPersitence")
	protected EntityManager em;
	
	protected EntityManager getEm() {
		return this.em;
	}
	
	protected Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
	    this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
	                            .getGenericSuperclass()).getActualTypeArguments()[0];
	 }

	@Override
	public List<T> getAll() {
		CriteriaBuilder criteriaBuilder = this.em.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(persistentClass);
		Root<T> root = criteriaQuery.from(this.persistentClass);
		criteriaQuery.select(root);
		return em.createQuery(criteriaQuery).getResultList();
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persist(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void merge(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}
}
