package com.finalkeyword;
//cannot change the value of final 
//formal argument once after reassigning


public class Demo2 {

	public static void main(String[] args) {
		test(10);
		// TODO Auto-generated method stub

	}
	static void test(final int i)
	{
		System.out.println(i);
		//i=20;
	}

}
