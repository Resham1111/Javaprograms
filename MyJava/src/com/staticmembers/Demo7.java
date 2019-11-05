package com.staticmembers;

public class Demo7 {
	static void m1()
	{
		System.out.println("from static method m1of demo7");
	}

	public static void main(String[] args) {
		m1();
		Demo7.m1();
		// TODO Auto-generated method stub

	}

}
