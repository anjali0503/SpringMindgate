package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class DependencyMain {
	public static void main(String[] args) {
		System.out.println("main start ");
//		System.out.println("Creating the object address object and calling set method");
//		
//		  
		
//		Address address =  new Address();
//		address.setAddressId(01);
//		address.setBuildingName("Gopal Nagar, near shiv sunder society");
//		address.setCity("Badlapur");
//		address.setPin("421503");
//		address.setStreet("Badlapur - karjat road");
//		address.setHouseNmuber("302");
//		
//		System.out.println(address);
//		
//		
//		System.out.println();
//		
//		System.out.println("Creating the object employee object and calling set method");
//		  
//		Employee employee = new Employee();
//		
//		employee.setEmployeeId(1);
//		employee.setAddress(address);
//		employee.setName("Anjali Pandey");
//		employee.setSalary(8976546);
//		System.out.println(employee);
//		
//		System.out.println("employee end");
		
		
		
//	
		Address  address = new Address(1, "Gopal Nagar", "gopal", "Karjat road", "badlapur", "421503");
		Employee employee = new Employee(1, "Anjali Pandey", 87878787, address  );
		System.out.println(employee);
		
		
		System.out.println("main ends");
	}
}
