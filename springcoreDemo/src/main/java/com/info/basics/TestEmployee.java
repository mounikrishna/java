package com.info.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		/*
		 * Employee employee = new Employee(); 
		 * employee.print();
		 */
		
		/*
		 * The object is in the factory Location , now we need to bring the object from
		 * that location using the ApplicationContext
		 */
		//We write this below step only for console based appliactions, no need for web based.
		ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
																	//created Spring Bean Configuration File Name.
		/*
		 * Now, we are getting the object using the getBean method. The bean returns
		 * only object type, So we need to typecast into Employee Type.......Now the
		 * object is created...
		 */
		Employee employee = (Employee)container.getBean("employee");
		employee.print();
		
	}

}
