package model;

import java.util.List;

public interface ICrud<T> {
	void create(T t);
	void update(T t);
	void delete(T t);
	T find(int t);
	List<T> ReadAll();
}
