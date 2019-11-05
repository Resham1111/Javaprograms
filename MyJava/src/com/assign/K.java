package com.assign;

public class K {
	
	static void toswap( int [] a)
	{
		int temp;
		temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;

	}

	public static void main(String[] args) {
		int [] a= {1,3,5,7,8,9};
		toswap(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
