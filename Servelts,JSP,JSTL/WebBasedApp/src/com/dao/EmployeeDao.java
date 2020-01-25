package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.LifecycleListener;

import com.model.Employee;

public class EmployeeDao {
	Connection connection;
	String driver = "com.mysql.jdbc.Driver"; 
	String url = "jdbc:mysql://localhost:3306/java";
	String username = "root";
	String password= "atluri.9";
	public EmployeeDao() {
	 try{
		 	Class.forName(driver);
		 	connection = DriverManager.getConnection(url, username, password);
	 	} catch (Exception e) {
	 		e.printStackTrace();
	 	}
	 }
	 public void createEmployee(Employee employee) {
		try {
			String query = "insert into employee(firstname, lastname, gender, salary, username, password) values(?,?,?,?,?,?)";
			
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, employee.getFirstname()); 
			ps.setString(2, employee.getLastname());
			ps.setString(3, employee.getGender());
			ps.setDouble(4, employee.getSalary());
			ps.setString(5, employee.getUsername());
			ps.setString(6, employee.getPassword());
			
			int result = ps.executeUpdate();
			
			if(result >0) {
				System.out.println("Employee Created");
			}else 
			{
				System.out.println("Employee not created");
			}
						
		} catch (Exception e) {
				e.printStackTrace();
		} 
	 }
	 public boolean checkEmployee(Employee employee) {
		 boolean flag = false;
		 try {
			 String query = "select * from employee where username=? and password=?";
			 PreparedStatement ps = connection.prepareStatement(query);
			 ps.setString(1,employee.getUsername());
			 ps.setString(2,employee.getPassword());
			 
			 ResultSet resultSet = ps.executeQuery();
			 
			 flag = resultSet.next();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		  
		 return flag;
	 }
	 
	 public List<Employee> getAllEmployee() {
		 List<Employee> allEmployees = new ArrayList<Employee>();
		 try {
			String query =  "select * from employee";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ResultSet resultSet = ps.executeQuery();
			//we cannot send the data to the servlet by using resultSet 
			// because resultset is an database related one, So we need to 
			//send the data from resultset to the List, then we can send data to servlet.
			
			while(resultSet.next()) {
				   Employee employee = new Employee();
				   employee.setEno(resultSet.getInt("eno"));
				   employee.setFirstname(resultSet.getString("firstname"));
				   employee.setLastname(resultSet.getString("lastname"));
				   employee.setGender(resultSet.getString("gender"));
				   employee.setSalary(resultSet.getDouble("salary"));
				   employee.setUsername(resultSet.getString("username"));
				   employee.setPassword(resultSet.getString("password"));
				   
				   allEmployees.add(employee); 
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		} 
		 return allEmployees;
	 }
	 public void deleteEmployee(int eno) {
		 try {
			 String query = "delete from employee where eno = ?";
			 PreparedStatement ps = connection.prepareStatement(query);
			 ps.setInt(1, eno);
			 
			 ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	 }
	 
}
