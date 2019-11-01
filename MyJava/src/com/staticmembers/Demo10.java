package com.staticmembers;

public class Demo10 {
	static int i;
	static
	{
		System.out.println("from static");
		System.out.println(i);
		int i=20;
	}

	public static void main(String[] args) {
		System.out.println("from main");
		System.out.println(i);
		// TODO Auto-generated method stub

	}

}
