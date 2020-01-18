package com.info.jdbc;

public class Employee {
	private int eno;
	private String name;
	private String gender;
	private double salary;

	public Employee() {
		
	}

	public Employee(int eno, String name, String gender, double salary) {
		this.eno = eno;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 
	
}
