package com.assignmentprogs;

public class Strong {

	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum =0;
		
		while(n>0)
		{
			int fact=1;
			int digit=n%10;
			while(digit>0)
			{
			fact=fact*digit--;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		if(temp==sum)
		System.out.println("strong");
		else
			System.out.println("not stromg");
		
			
			
		
		// TODO Auto-generated method stub

	}

}
