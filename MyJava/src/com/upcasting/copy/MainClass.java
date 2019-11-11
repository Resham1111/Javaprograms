package com.upcasting.copy;

public class MainClass {

	public static void main(String[] args) {
		A ob1=new B();
		System.out.println(ob1.i);
		//System.out.println(ob1.j);
//using parent type ref cannot access child members

		
		B ob2=new B();
		A ob3=ob2;//upcasting B TO A
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		System.out.println(ob3.i);
		//System.out.println(ob3.j);
		//using parent type ref cannot access child members
		
		C ob4=new C();//object creation
		B ob5=ob4;//upcasting c to B
		A ob6=ob4;//upcasting c to A
		
		
		System.out.println(ob4.k);
		System.out.println(ob5.i);
				System.out.println(ob5.j);
				System.out.println(ob6.i
						);
				
		
		
		
	}

}
