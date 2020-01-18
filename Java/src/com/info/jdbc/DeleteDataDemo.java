package com.info.jdbc;

import java.util.Scanner;

public class DeleteDataDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter eno to delete");
		 int eno = sc.nextInt();
		 
		 Employee employee = new Employee();
		 employee.setEno(eno);
		 
		 EmployeeDAO dao = new EmployeeDAO();
		 dao.DeleteEmployee(employee);
		 sc.close();
	}

}
