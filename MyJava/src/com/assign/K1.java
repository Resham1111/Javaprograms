package com.assign;

public class K1 {
	
	static void toswap(int[] a, int p1,int p2)
	{
		int temp=a[p1];
		a[p1]=a[p2];
		a[p2]=temp;
		
	}

	public static void main(String[] args) {
		
		int [] a ={1,5,7,8};
		
		toswap(a,0,3);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
