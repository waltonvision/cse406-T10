package com.mvc.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TodoDAODB implements TodoDAO{
	
	Connection connection;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/mydb";
	static final String USER = "root";
	static final String PASS = "Acca2019";
	
	public TodoDAODB() {
					
			try {
				Class.forName(JDBC_DRIVER);
				connection = DriverManager.getConnection(DB_URL, USER, PASS);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();}
			}



	@Override
	public Todo get(int id) {
		return null;
	}

	@Override
	public List<Todo> getAll() {
		
		List<Todo> todos = new ArrayList<>();		
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM todos");
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String item = rs.getString("item");
				Todo todo = new Todo (id,item);
				todos.add(todo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return todos;
	}



	@Override
	public void save(String item) {
		
		
		
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO todos VALUES(0,?)");
			ps.setString(1,item);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	@Override
	public void delete(int id) {

		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM todos WHERE id=?");
			ps.setInt(1,id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
