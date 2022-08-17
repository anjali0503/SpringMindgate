package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
 private int houseNumber;
 private String houseName;
 private String pin;
 
 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
 public Address(int houseNumber, String houseName, String pin) {
		super();
		this.houseNumber = houseNumber;
		this.houseName = houseName;
		this.pin = pin;
	}
 
 public Address() {
	
	 System.out.println("default construtor of address class");
}
 

 
@Override
public String toString() {
	return "Address [houseNumber=" + houseNumber + ", houseName=" + houseName + ", pin=" + pin + "]";
}

public int getHouseNumber() {
	return houseNumber;
}

public void setHouseNumber(int houseNumber) {
	this.houseNumber = houseNumber;
}

public String getHouseName() {
	return houseName;
}

public void setHouseName(String houseName) {
	this.houseName = houseName;
}

public String getPin() {
	return pin;
}

public void setPin(String pin) {
	this.pin = pin;
}




}
