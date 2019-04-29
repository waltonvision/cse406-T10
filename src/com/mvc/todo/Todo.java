package com.mvc.todo;

public class Todo {
	
	private String item;
	private int id;
	
	Todo(int id, String item){
		this.setItem(item);
		this.setId(id);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
