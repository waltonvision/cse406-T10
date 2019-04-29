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
 * Servlet implementation class TodoDeleteServlet
 */
@WebServlet("/delete")
public class TodoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.valueOf( request.getParameter("id") );
		TodoDAO todoDAO = new TodoDAODB();
		todoDAO.delete(id);
		response.sendRedirect(getServletContext().getContextPath()); 
	}



}
