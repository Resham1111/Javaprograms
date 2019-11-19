package com.practiceprogs;
//store digits of a no. in an array

public class gg
{

	public static void main(String[] args) {
		int n=123;
		int temp;
		int count=0;
		temp=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
		n=temp;
		
		
			 
			
			 int [] a= new int[count];
			  
			  for(int i=0;i<a.length;i++)
			  {
				  a[i]=n%10;
				  System.out.println(a[i]);
				  n=n/10;
			  }
				  
			  
			
		
	}
}
	
		  
