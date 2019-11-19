package com.practiceprogs;
//print each digit of a no.

public class g {

	public static void main(String[] args) {
		int count=0;
		int n=1234;
		int temp=n;
		
		while(n>0)
		{
			int digit=n%10;
			System.out.println(digit);
			count++;
			
			n=n/10;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
