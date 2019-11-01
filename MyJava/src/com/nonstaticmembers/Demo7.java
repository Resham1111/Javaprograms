package com.nonstaticmembers;

public class Demo7 {
	int i=20;
	void m1()
	{
		System.out.println(this);
		System.out.println(this.i);
		
	}

	
	public static void main(String[] args) {
		Demo7 ob1=new Demo7();
		ob1.m1();
		System.out.println(ob1.i);
		
		
		// TODO Auto-generated method stub

	}

}
