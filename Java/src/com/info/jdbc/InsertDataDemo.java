package com.info.jdbc;

import java.util.Scanner;

public class InsertDataDemo {

	public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("eno, name, gender, salary");
		int no = scanner.nextInt();
		String name =  scanner.next();
		String gender = scanner.next();
		double salary = scanner.nextDouble();
		
		Employee employee =  new Employee(no, name, gender, salary);
		
		EmployeeDAO dao =  new EmployeeDAO();
		
		dao.createEmployee(employee);
		
		scanner.close();
	}

}
