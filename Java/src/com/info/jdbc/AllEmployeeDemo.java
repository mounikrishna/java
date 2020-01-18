package com.info.jdbc;

public class AllEmployeeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		EmployeeDAO eDao = new EmployeeDAO();
		eDao.AllEmployee(employee);
	}

}
