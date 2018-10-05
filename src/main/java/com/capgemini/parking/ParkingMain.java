package com.capgemini.parking;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ParkingMain 
{
	Map<Integer,Customer> car;
	public ParkingMain() 
	{
		this.car=new HashMap<>();
	}
	public int generateParkingId()
	{
		Parking p=new Parking();
		return p.getFloor()*100+p.getSection()*10+p.getCompartment();
	}
	public void addCar(Integer parkingId,Customer cust)
	{
		 for (Map.Entry<Integer,Customer> entry : car.entrySet())  
		 {
			 if(entry.getValue()==null)
			 {
				 car.put(entry.getKey(),cust);
				 return;
			 } 
		 }
		car.put(parkingId,cust);
	}
	
	public void display()
	{
		 for (Entry<Integer, Customer> entry : car.entrySet())  
		 {
			 
				 System.out.println("Key = " + entry.getKey() + 
                         ", Value = " + entry.getValue()); 
		 }
	}
	 public Set<Map.Entry<Integer,Customer>> getAllParkingDetails()
	 {
		 return car.entrySet();
	 }
	 
	 public Customer retrieval(int parkingId)
	 {
		 return car.get(parkingId);
	 }
	 
	 public boolean removeCar(int parkingId)
	 {
		if( car.containsKey(parkingId))
		{
			car.put(parkingId,null);
			return true;
		}
		return false;
	 }
	public static void main(String[] args) 
	{
		Customer cust=new Customer("Swagata","8961934889","09:50");
		Customer cust1=new Customer("Ashwini","8961934889","15:30");
		ParkingMain carPark=new ParkingMain();
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		carPark.addCar(carPark.generateParkingId(), cust);
		System.out.println("After adding:");
		System.out.println(carPark.getAllParkingDetails());
		carPark.removeCar(112);
		
		boolean f=carPark.removeCar(679);
		if(f==false)
			System.out.println("Invalid ParkingId");
			
		System.out.println("After removing:");
		System.out.println(carPark.getAllParkingDetails());
		
		carPark.removeCar(118);
		carPark.addCar(carPark.generateParkingId(), cust1);
		System.out.println("After removing and adding again:");
		System.out.println(carPark.getAllParkingDetails());
		System.out.println("Details of particular ParkingId");
		System.out.println(carPark.retrieval(117));
		carPark.addCar(carPark.generateParkingId(), cust1);
		carPark.addCar(carPark.generateParkingId(), cust1);
		System.out.println("Display all:");
		carPark.display();
	}

}
