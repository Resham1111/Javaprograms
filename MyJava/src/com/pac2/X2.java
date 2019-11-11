package com.pac2;

//TO ACCESS PRIVATE MEMBERS FROM DIFF PAC DIFF CLASS



//to access default members from diff class diff pack=not possible
import com.Pac1.A1;

public class X2 {

	public static void main(String[] args) {
		A1 ob =new A1();//can create obj
		System.out.println(ob.j);//cte but cannot access members
		
		System.out.println(A1.i);//not possible cte
		// TODO Auto-generated method stub

	}

}

