package com.practice;
//count digit of a no.
public class f {

	public static void main(String[] args) {
		int n=234;
		int temp=n;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		// TODO Auto-generated method stub
System.out.println(count);
	}

}
