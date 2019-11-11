package com.assign;
//fibonacci series 0 1 1 2 3 5 8 13
//print 5th term in fibonacci

public class Fib {

	public static void main(String[] args) {
		
		//initializing the first 3 terms
		int t1=0;
		int t2=1;
		int t3=1;
		//System.out.println(t1);
		//System.out.println(t2);
		//System.out.println(t3);
		 
		int n=10;
		//will start printing from 4th term
		 for(int i=3;i<=n;i++)
		 {
			 int sum=t2+t3;
			 //just to print fibonacci terms
			// System.out.println(sum);
			 
			 
			 
			 t2=t3;
			 t3=sum;
			 
			 //now to print 5th term
			 if(i==3)
			 {
				 System.out.println(sum);  //2 the fifth term
				 break;
				 
			 }
			 
			 
		 }
		// TODO Auto-generated method stub

	}

}
