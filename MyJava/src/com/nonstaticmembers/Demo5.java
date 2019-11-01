package com.nonstaticmembers;
//non static context demo
//this keyword
public class Demo5 {
	void m1() //non static context
	{
		System.out.println("from m1");
		System.out.println(this);
	}
	

	public static void main(String[] args)
	{
		Demo5 x=new Demo5();
		x.m1();// use object reference variable
		
		
		
		// TODO Auto-generated method stub

	}

}
		