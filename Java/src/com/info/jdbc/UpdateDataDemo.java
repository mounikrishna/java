package com.info.jdbc;

import java.util.Scanner;

public class UpdateDataDemo{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eno and salary");
		int eno= sc.nextInt();
		double salary = sc.nextDouble();
		
		Employee employee = new Employee();
		employee.setEno(eno);
		employee.setSalary(salary);
				
		EmployeeDAO dao = new EmployeeDAO();
		dao.UpdateEmployee(employee);
		sc.close();
	}

}

