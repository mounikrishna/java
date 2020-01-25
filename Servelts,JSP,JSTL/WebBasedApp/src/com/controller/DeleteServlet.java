package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployeeDao;
import com.model.Employee;

@WebServlet("/delete.htm")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//hyperlink always gets get requests so we not using doPost
    	int no = Integer.parseInt(request.getParameter("eno"));
    	
    	EmployeeDao eDao = new EmployeeDao();
    	eDao.deleteEmployee(no); 
    	//sending eno to the DAO to delete the respective record
    	
    	//after deleting the record we want to be in the same page 
    	//So, we need a list to get the list we are hitting DAO gor getAllEmployee() method 
    	List<Employee> allEmployees = eDao.getAllEmployee();
    	request.setAttribute("employees", allEmployees);
    	RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
    	dispatcher.forward(request, response);
	}

}
