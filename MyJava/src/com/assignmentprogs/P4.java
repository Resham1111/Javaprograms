package com.assignmentprogs;

public class P4 {
	
	{
		System.out.println("from m1");
		
	}
	
	P4()
	{
		System.out.println("from m2");
	}

	P4(int n)
	{
		this();
		System.out.println("from m3");
		
	}
	
	P4(int n,int m)
	{
		this(10);
		System.out.println("from m4");
	}
	
	
	public static void main(String[] args) {
		P4 ob1=new P4();
		System.out.println("*****");
		P4 ob2 = new P4(10);
		System.out.println("&&&&");
		P4 ob3 =new P4(10,20);
		
		
		// TODO Auto-generated method stub

	}

}
