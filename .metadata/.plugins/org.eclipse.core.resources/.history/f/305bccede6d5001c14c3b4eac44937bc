package com.ab.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.daos.StudentDAO;
import com.ab.daos.StudentDAOImpl;
import com.ab.models.Student;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
        StudentDAO dao = new StudentDAOImpl();
		
		StudentController ctrl = new StudentController(dao);
		
		
        String username = request.getParameter("username");
		
		String password = request.getParameter("password");

		
		
		Student loggedInStudent = ctrl.loginStudent(username, password); 
				
		 response.setContentType("text/html"); 
		
		if(loggedInStudent != null) {
			
			String firstname = loggedInStudent.getFirstName();
			HttpSession session = request.getSession(true);
			
			// Code to store list of students in a session object
			
			session.setAttribute("firstname", firstname);
			 
			response.sendRedirect("welcome.jsp");
		}
		else {
		
		   response.sendRedirect("login.jsp");	
		}
		
		
		
		
	}

}