package edu.mum.ea.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.mum.ea.dao.GenericDao;

public abstract class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> daoType;

	public void setDaoType(Class<T> type) {
		daoType = type;
	}

	public void save(T entity) {
		entityManager.persist(entity);
		entityManager.flush();
	}

	public void delete(T entity) {
		entityManager.remove(entity);
	}

	public void delete(Long id) {
		T entity = findOne(id);
		delete(entity);
	}

	public T findOne(Long id) {
		return (T) entityManager.find(daoType, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T findById(Long id) {
		return (T) entityManager.createQuery(String.format("from %s where id =%d", daoType.getName(), id))
				.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("from " + daoType.getName()).getResultList();
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public List<T> findAll(String s, Object hint) {
		return (List<T>) entityManager.createQuery("SELECT m FROM Member AS m").setHint(s, hint).getResultList();
	}
}