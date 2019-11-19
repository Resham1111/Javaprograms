package com.assignmentprogs;

public class Main1 {

	public static void main(String[] args) {
		
		A ob1=new A(12);
		display(ob1);
		B ob2=new B(40,50);
		display(ob2);
		C ob3=new C(12,34,67);
		display(ob3);
	}
		
		static void display (A ob)
		{
			System.out.println(ob.i);
			
			if(ob instanceof B)
			{
				B obb=(B) ob;
				System.out.println(obb.j);
				
			}
			
			if(ob instanceof C)
			{
				C obj=(C) ob;
				System.out.println(obj.k);
				
			}
		
		
		System.out.println("................");
		
		}
		
		// TODO Auto-generated method stub

	
}


