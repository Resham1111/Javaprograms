package com.assignmentprogs;
//non static members

public class A1 {
	
	int i;
	void initializing(int i)
	{
		System.out.println(this.i);
		
		this.i=i;
		
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		A1 obj=new A1();
		obj.initializing(10);
		
		
		
		// TODO Auto-generated method stub

	}

}
