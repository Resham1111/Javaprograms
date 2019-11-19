package com.assignmentprogs;

public class Arm {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int count=0;
		while(n>0)   //count no of digits total
		{
			count ++;
			n=n/10;
		}
		
		n=temp;
		
		int sum=0;
		
		while(n>0)
		{
			int digit =n%10;
			int pow=count;
			int prod=1;
			
			
		while(pow>0)
		{
			prod=prod*digit;
			pow--;
		}
		sum=sum + prod;
		n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("arm");
			
		}
		else
		{
			System.out.println("not arm");
			
		}
		
		// TODO Auto-generated method stub

	}

}
