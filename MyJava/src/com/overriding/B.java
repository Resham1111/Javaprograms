package com.overriding;
//super keyword

public class B extends A {
	int j=20;
	void display()
	{
		super.display();
		System.out.println(j);
		
	}

}
