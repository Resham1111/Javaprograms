package com.abstractclass;

public class Rectangle extends Shape{
	int l;
	int b;
	Rectangle()
	{
		
	}
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	double area()
	{
		return(l*b);
		
		
	}
}
