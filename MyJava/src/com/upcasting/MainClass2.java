package com.upcasting;

public class MainClass2 {

	public static void main(String[] args) {
		A1 ob1=new A1(12);
		display(ob1);
		B1 ob2=new B1(13,56);
		display(ob2);
		C1 ob3=new C1(45,78);
		display(ob3);
	}
		
		static void display(A1 ob)
		{
			System.out.println(ob.i);
			
			if(ob instanceof B1)
			{
				B1 obj=(B1) ob;
				System.out.println(obj.j);
			}
			if(ob instanceof C1)
			{
				C1 obj2=(C1) ob;
				System.out.println(obj2.k);
				
			}
			System.out.println("...............");
		}
		
		
		
		// TODO Auto-generated method stub

	}


