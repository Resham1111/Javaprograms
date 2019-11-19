package com.assignmentprogs;

public class SearchLinear {


	//WAP to find element x in an array of size n, (linear search)

      public static int search (int a[], int n, int x)
		
		{
			for(int i=0;i<=a.length;i++)
			{
				if (a[i]==x)
				return i;
			                   //return index 
			}
			                  // return -1 if element not found
			return -1;
			
		}
		
			
		

		public static void main(String[] args) 
		{
			int [] a= {1,3,7,3};
			int n =a.length;
			int x=7;
			
			int index=search(a,n,x);//method call statement
			if(index==-1)
				System.out.println("element does not exist");
			else
				System.out.println("element found at position:" + index);
			
			
			// TODO Auto-generated method stub

		}

	}