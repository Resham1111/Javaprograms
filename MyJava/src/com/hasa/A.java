package com.hasa;

public class A {
	static int x=10;
	int y=20;
	static 
	{
		System.out.println("from sib A");
	}

	{
		System.out.println("from iib of A");
		
	}
	
	A()
	{
		System.out.println("from a()");
	}
}
