package com.constructor;
//accessing non static var from the non static block i.e constructor

public class P1 {
	int i;
	P1()
	{ System.out.println(this);
		System.out.println(i);
		i=10;
		System.out.println(this.i);
		
	}
	public static void main(String[] args) {
		
		P1 ob =new P1();
		System.out.println(ob.i);
		System.out.println("&&&&&");
		P1 ob2=new P1();
		
	}

}
