package com.company.Dao;

import java.util.List;

public interface DaoContract<T, I> {
	
	List<T> findall();
	
	T findById(I id);

	int update(T t);

	int delete(I id);

	T insert(T t);

}
