package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.model.Employee;

@WebServlet("/check.htm")   //URL  OR URI
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname =  request.getParameter("username");
		String password  = request.getParameter("password");
		
		Employee employee = new Employee();
		employee.setUsername(uname);	
		employee.setPassword(password);
			
		EmployeeDao eDao = new EmployeeDao();
		boolean flag = eDao.checkEmployee(employee);
		
		RequestDispatcher dispatcher = null;
		if(flag) {
		//if(flag == true) {
			dispatcher = request.getRequestDispatcher("home.jsp");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			request.setAttribute("user", uname);
			//dispatcher.forward(request, response);
		}
		else {
			dispatcher = request.getRequestDispatcher("login.jsp");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			request.setAttribute("message", "Invalid Credentials");
			//dispatcher.forward(request, response);
		}
		dispatcher.forward(request, response);
	}

}
