package com.typecasting;

public class Demo5 {
	public static void print(double x)
	{
		System.out.println("print double");
		System.out.println(x);
	}
	public static void print(int x)
	{
		System.out.println("print int");
		System.out.println(x);
	}

	public static void main(String[] args) {
		print(10.0f);
		print('c');
		print(10);
		
		// TODO Auto-generated method stub

	}

}
