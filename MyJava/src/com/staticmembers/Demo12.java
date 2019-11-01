package com.staticmembers;

public class Demo12 {
	static boolean j;
	static
	{
		System.out.println("from sib of demo12");
	}
	

	public static void main(String[] args) {
		System.out.println("from main of d12");
		System.out.println(Demo11.i);
		// TODO Auto-generated method stub

	}

}
