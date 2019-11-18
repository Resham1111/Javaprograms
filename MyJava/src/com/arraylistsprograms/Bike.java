package com.arraylistsprograms;

public class Bike {
	String color;
	int mileage;
	
	
	Bike()
	{
		
	}
	Bike (String color,int mileage)
	{
		this.color=color;
		this.mileage=mileage;
		
	}

	public String toString()
	{
		return "[Bike details: " + color+ " " +mileage + "]";
		
	}
}
