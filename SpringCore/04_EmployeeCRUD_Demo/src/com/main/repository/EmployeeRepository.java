package com.main.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository implements EmployeeRepositoryInterface {

	@Override
	public boolean addEmployee() {
		System.out.println("employeeRepository addEmployee()");
		return false;

	}

}
