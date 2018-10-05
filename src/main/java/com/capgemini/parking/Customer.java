package com.capgemini.parking;

public class Customer 
{
	String name;
	String phoneNumber;
	String parkingTime;
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getParkingTime() {
		return parkingTime;
	}
	public Customer(String name, String phoneNumber, String parkingTime) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.parkingTime = parkingTime;
	}
	@Override
	public String toString() 
	{
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + ", parkingTime=" + parkingTime + "]";
	}
	
}
