package com.pac2;

//to access private members from sub class another pack-not possible
import com.Pac1.A1;

public class E1 extends A1 {

	public static void main(String[] args) {
		System.out.println(i);//cte cannot access
		E1 ob =new E1();
		System.out.println(ob.j);//cte cannot access
		// TODO Auto-generated method stub

	}

}

