package com.finalkeyword;
//cannot reassign final local variables

public class Demo1 {

	public static void main(String[] args) {
		final int i=100;
		System.out.println(i);
		//i=i+1;
		System.out.println((i+1));
		//System.out.println((++i));
		//i=12;
		
		
		// TODO Auto-generated method stub

	}

}
