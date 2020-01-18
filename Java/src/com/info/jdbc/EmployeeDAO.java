package com.info.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	String url = "jdbc:mysql://localhost:3306/java";
	String username = "root";
	String password = "atluri.9";
	//insert employee data
	public void createEmployee(Employee employee) {
				
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String query = "insert into employee values(?,?,?,?)";   	
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getGender());
			ps.setDouble(4, employee.getSalary());
			
			int result = ps.executeUpdate();
			
			if(result > 0) {
				System.out.println("Employee Created");
			}
			else {
				System.out.println("Employee not created");
			}
		}
		
		catch(SQLException e){
			 e.printStackTrace();
		}
		
	}
	//update employee salary
	public void UpdateEmployee(Employee employee){
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String query =  "update employee set salary = salary + ? where eno = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setDouble(1, employee.getSalary());
			ps.setInt(2, employee.getEno());
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("Employee updated");
			}else {
				System.out.println("Employee not existed");
			}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		
	}
	//delete employee
	public void DeleteEmployee(Employee employee){
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "DELETE FROM employee WHERE eno =?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, employee.getEno());
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println("Employee deleted");
			}else {
				System.out.println("Employee not deleted");
			}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		
	}
	//select all employee
	public void AllEmployee(Employee employee) {
		try {
			Connection  connection = DriverManager.getConnection(url, username, password);
			String query = "select * from employee";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet resultSet = ps.executeQuery();     //ResultSet points to all the row at a time...
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("eno")+"\t"+resultSet.getString("name")+"\t"+resultSet.getString("gender")+"\t"+
						resultSet.getDouble("salary"));
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//search from employee
	public void SearchEmployee(Employee employee) {
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "select * from employee where eno = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1,employee.getEno());
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt("eno")+"\t"+resultSet.getString("name")+"\t"+resultSet.getString("gender")+"\t"+
						resultSet.getDouble("salary"));
			}else {
				System.out.println("employee doesn't exist");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
