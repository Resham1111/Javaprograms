package com.practice;

public class S {
	int i;
	void m1()
	{
		int i=10;
		System.out.println(i);
		System.out.println(this.i);
		this.i=20;
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		S ob=new S();
		ob.m1();
		System.out.println(ob.i);
		// TODO Auto-generated method stub

	}

}
