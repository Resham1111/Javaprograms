package com.nonstaticmembers;

public class Main2 {

	public static void main(String[] args) 
	{
		E o1=new E();
		D o2=new D();
		System.out.println(o1.d);
		System.out.println(o2.d);
		o1.d=12;
		o2.d=13;
		System.out.println(o2.d);
		System.out.println(o1.d);
		
		
		// TODO Auto-generated method stub

	}

}
