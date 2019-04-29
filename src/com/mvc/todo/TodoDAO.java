package com.mvc.todo;

import java.util.List;

public interface TodoDAO {
	
	Todo get(int id);
	
	List<Todo> getAll();

	void save(String item);

	void delete(int id);
}
