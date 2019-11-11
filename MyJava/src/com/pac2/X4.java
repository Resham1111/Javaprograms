package com.pac2;
//TO ACCESS pubic MEMBERS FROM DIFF CLASS,DIFF PACKAGE--NOT POSSIBLE
import com.Pac1.A4;

public class X4 {

	public static void main(String[] args) {
		A4 ob =new A4();//can create obj
		System.out.println(ob.j);//cte but cannot access members
		
		System.out.println(A4.i);//not possible cte
		// TODO Auto-generated method stub

	}
}

