package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.main.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeService implements EmployeeServiceInterface {
 
	@Autowired
	private EmployeeRepositoryInterface employeeRepositoryInterface;
 
	@Override
	public boolean addEmployee() {
		// TODO Auto-generated method stub

		System.out.println("emplyoee service addEmplyee()");
		return employeeRepositoryInterface.addEmployee();
	}

	public EmployeeRepositoryInterface getEmployeeRepositoryInterface() {
		return employeeRepositoryInterface;
	}

	public void setEmployeeRepositoryInterface(EmployeeRepositoryInterface employeeRepositoryInterface) {
		this.employeeRepositoryInterface = employeeRepositoryInterface;
	}

}
