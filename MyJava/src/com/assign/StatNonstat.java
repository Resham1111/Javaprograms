package com.assign;

public class StatNonstat {
	int i;
	static double k;
	void m1()   //accessing static and non static var from non static context
	{
		k=4.987;  //directly
		System.out.println(k);
		
		this.i=67;
		System.out.println(this.i);
		
		
		
		
	}
	static void m2(StatNonstat s)
	{
		s.i=30;
		System.out.println(s.i);
		System.out.println(k);
		k=20.9;
		System.out.println(k);
		
	}
	
	
	

	

	public static void main(String[] args) {
		
		StatNonstat s1=new StatNonstat();
		
		m2(s1);
		s1.m1();
		
		
		s1.i=10;
		System.out.println(s1.i);
		
				
		// TODO Auto-generated method stub

	}

}
