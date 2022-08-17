package com.mindgate.pojo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private int addressId;
	private String houseNmuber;
	private	 String buildingName;
	private String street;
	private String city;
	private String pin;


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNmuber=" + houseNmuber + ", buildingName=" + buildingName
				+ ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	

	public Address(int addressId, String houseNmuber, String buildingName, String street, String city, String pin) {
		super();
		this.addressId = addressId;
		this.houseNmuber = houseNmuber;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNmuber() {
		return houseNmuber;
	}

	public void setHouseNmuber(String houseNmuber) {
		this.houseNmuber = houseNmuber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
