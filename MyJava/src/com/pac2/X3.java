package com.pac2;
//TO ACCESS PROTECTED MEMBERS FROM DIFF CLASS,DIFF PACKAGE--NOT POSSIBLE
import com.Pac1.A3;

public class X3 {

	public static void main(String[] args) {
		A3 ob =new A3();//can create obj
		System.out.println(ob.j);//cte but cannot access members
		
		System.out.println(A3.i);//not possible cte
		// TODO Auto-generated method stub

	}
}

