package com.assignmentprogs;
//reverse user ip no. using for loop

import java.util.Scanner;


public class Rever {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//eg 456
				System.out.println("enter the no");
				
				int n=sc.nextInt();
				int temp=n;
				int rev=0;
				
				for(;n!=0;n/=10)
				{
					int digit=n%10; //6
					
					rev=rev*10+digit;
					//45
					
				}
				System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
