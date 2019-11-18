package com.abstractclass;

abstract 01public class Animal {
	double height;
	double weight;
	 Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	

	abstract void talk();
}
