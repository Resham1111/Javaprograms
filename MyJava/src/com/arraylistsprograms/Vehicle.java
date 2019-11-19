package com.arraylistsprograms;

public class Vehicle {
	
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", speed=" + speed + "]";
	}

	String color;
	double speed;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String color, double speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	

}
