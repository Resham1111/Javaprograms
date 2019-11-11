package com.pac2;

//to access public members from sub class, another pack-----not possible
import com.Pac1.A4;

public class E4 extends A4 {

	public static void main(String[] args) {
		System.out.println(i);//cte cannot access
		E4 ob =new E4();
		System.out.println(ob.j);//cte cannot access
		// TODO Auto-generated method stub

	}

}



