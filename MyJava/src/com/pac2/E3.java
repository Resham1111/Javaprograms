package com.pac2;

//to access PROTECTED members from sub class, another pack-----not possible
import com.Pac1.A3;

public class E3 extends A3 {

	public static void main(String[] args) {
		System.out.println(i);//cte cannot access
		E3 ob =new E3();
		System.out.println(ob.j);//cte cannot access
		// TODO Auto-generated method stub

	}

}
