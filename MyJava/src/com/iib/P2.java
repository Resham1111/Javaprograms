package com.iib;
//initializing the non static member

public class P2 {
	int i;
	{
		System.out.println(i);//0
		this.i=20;//20
		System.out.println("from IIB");
		
	}
	
	P2 ()
	{
		System.out.println("from P2");
		
	}
	
	P2(int i)
	{
		System.out.println(this.i);//20
		this.i=i;//10
	}

	public static void main(String[] args) {
		System.out.println("main begins");
		P2 ob1=new P2();
		System.out.println(ob1.i);//20
		P2 ob2=new P2(10);
		System.out.println(ob2.i);//10
		System.out.println("main ends");
		
		// TODO Auto-generated method stub

	}

}
