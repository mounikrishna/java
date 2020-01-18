package com.info.jdbc;

import java.util.Scanner;

public class SearchDataDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eno number");
		int eno = sc.nextInt();
		
		Employee employee = new Employee();
		employee.setEno(eno);
		EmployeeDAO eDao = new EmployeeDAO();
		eDao.SearchEmployee(employee);
		sc.close();
		
	}

}
