package com.staticmembers;

public class Demo9 {
	static
	{
		System.out.println("from sib1");
	}
	

	public static void main(String[] args) {
		System.out.println("from main");
		
		// TODO Auto-generated method stub

	}
	static
	{
		System.out.println("from sib 2");
		
	}

}
