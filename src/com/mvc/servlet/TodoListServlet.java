package com.mvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.todo.TodoDAO;
import com.mvc.todo.TodoDAODB;

/**
 * Servlet implementation class TodoListServlet
 */
@WebServlet("/")
public class TodoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TodoDAO todoDAO = new TodoDAODB();
		request.setAttribute("todolist", todoDAO.getAll());
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}


}
