package com.staticmembers;

public class Demo11 {
	static int i;
	static
	{
		System.out.println("from sib of demo11");
	}

		
		// TODO Auto-generated method stub

	//}
	public static void main(String[] args) {
		System.out.println("from main of demo11");
		System.out.println(Demo12.j);
		
	}

}
