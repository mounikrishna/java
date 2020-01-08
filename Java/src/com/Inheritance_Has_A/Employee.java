package com.Inheritance_Has_A;

//Inheritance should be used only if the relationship is-a is maintained 
	//throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.
public class Employee {
	String name;
	int id;
	Address address;
	public Employee(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	void display() {
		System.out.println(name+" "+id);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address address1 = new Address("st louis", "mo", "usa");
		Employee emp = new Employee("mouni", 123, address1);
		emp.display();
	}
	
	

}
