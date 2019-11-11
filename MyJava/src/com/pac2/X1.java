package com.pac2;

//to access default members from diff class diff pack=not possible
import com.Pac1.A2;

public class X1 {

	public static void main(String[] args) {
		A2 ob =new A2();//can create obj
		System.out.println(ob.j);//cte but cannot access members
		
		System.out.println(A2.i);//not possible cte
		// TODO Auto-generated method stub

	}

}
