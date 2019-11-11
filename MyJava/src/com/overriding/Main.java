package com.overriding;
//10 ..10 20...10 20 30
public class Main {

	public static void main(String[] args) {
		A ob1=new A();
		ob1.display();//10
		System.out.println(">>>>>>>>>>>>>");
		
		B ob =new B();
		ob.display();//10 20
		System.out.println(">>>>>>>>>>>>>");
		
		C ob3 =new C();
		ob3.display();//10 20 30
		
		
		
		// TODO Auto-generated method stub

	}

}
