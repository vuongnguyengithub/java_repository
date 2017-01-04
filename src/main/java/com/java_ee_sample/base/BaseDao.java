package com.java_ee_sample.base;

import java.util.List;

public interface BaseDao<T> {
	public List<T> getAll();
	public void delete(T t);
	public void delete(long id);
	public void persist(T t);
	public void merge(T t);
	public void update(T t);
}
