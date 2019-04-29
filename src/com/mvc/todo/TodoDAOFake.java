package com.mvc.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDAOFake implements TodoDAO{

	@Override
	public Todo get(int id) {
		return new Todo(1,"item");
	}
	
	@Override
	public List<Todo> getAll() {
		List<Todo> todos = new ArrayList<>();
		
		todos.add(new Todo(11,"item01"));
		todos.add(new Todo(12,"item02"));
		todos.add(new Todo(13,"item03"));
		
		return todos;
	}

	@Override
	public void save(String item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
