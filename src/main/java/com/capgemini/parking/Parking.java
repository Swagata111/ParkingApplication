package com.capgemini.parking;

public class Parking
{
	int floor;
	int section;
	int compartment;
	static int f=1;
	static int s=1;
	static int c=1;
	
	public Parking()
	{
		compartment=c++;
		section=s;
		floor=f;
		if(compartment>10)
		{
			c=1;
			section=s++;
			if(section>4)
			{
				c=1;
				s=1;
				floor=f++;
			}
		}
	}
	public Parking(int floor, int section, int compartment) 
	{
		super();
		this.floor = floor;
		this.section = section;
		this.compartment = compartment;
	}
	public int getFloor() {
		return floor;
	}
	
	public int getSection() {
		return section;
	}
	
	public int getCompartment() {
		return compartment;
	}
	@Override
	public String toString() {
		return "f" + floor + ", s" + section + ", c" + compartment;
	}
	
	
}
