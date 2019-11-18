package com.tostring;

public class Company {

	public static void main(String[] args) {
		Emp1 ob=new Emp1(1,"resham",2349);
		System.out.println(ob);
		Emp1[] e = {new Emp1(2,"resh",5654),ob};
		System.out.println(e[0]);
		// TODO Auto-generated method stub

	}

}
