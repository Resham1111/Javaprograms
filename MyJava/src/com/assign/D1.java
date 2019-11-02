package com.assign;
//store sq in array
public class D1 {
	
	/*public static int m1(int n)

	{
		
		
		int sq=1;
		for(int i=1;i<=n;i++)
		{
			sq=i*i;
			
			
			
		}
		
		
		
	}
	*/
	
		
	
	public static void main(String[] args) {
		int n=5;
		int [] a=new int[n];
		for(int i=0,j=1;i<a.length;i++,j++)
		{
			a[i]=j*j;
		
		
		System.out.println(a[i]);
		}
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
