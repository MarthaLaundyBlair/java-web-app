package com.ab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ab.daos.CustomerDAO;
import com.ab.daos.CustomerDAOImpl;
import com.ab.models.Customer;

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
		

        CustomerDAO dao = new CustomerDAOImpl();
		
		CustomerController ctrl = new CustomerController(dao);
		
		
        String username = request.getParameter("username");
		
		String password = request.getParameter("password");

		
		
		Customer loggedInCustomer = ctrl.loginCustomer(username, password); 
				
		 response.setContentType("text/html"); 
		
		if(loggedInCustomer != null) {
			
			String firstname = loggedInCustomer.getFirstName();
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
