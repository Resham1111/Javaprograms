package com.arrays;

public class Demo8 {

	public static void main(String[] args)
	{
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
			// TODO Auto-generated method stub
		}
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
			System.out.println(a[i]);
		}
			
		for(int i =a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	
			

	}

}