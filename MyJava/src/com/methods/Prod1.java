package com.methods;
import java.util.Scanner;
public class Prod1
{

	    public static void main(String[] args)
	    {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		
		int b[]=new int[size];
		for(int j=0,i=size-1;j<=size-1;j++,i--)
		{
			b[j]=a[i];
		}
		
		for(int j=0;j<a.length;j++) 
		{
		System.out.println(b[j]);
		}
		
		
		// TODO Auto-generated method stub

	}

}
