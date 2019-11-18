package com.assign;

public class Main2 {

	public static void main(String[] args) {
		
		Emp ob=new Emp(1, "resh",677.08);
		Emp obj=new Emp(1, "resh",677.08);
		
		System.out.println(ob);
		System.out.println(obj.hashCode());
		System.out.println(ob.hashCode());
		TestEngineer ob2=new TestEngineer(2,"r",6514,"selenium");
		System.out.println(ob2);
		TestEngineer ob3=new TestEngineer(2,"r",6514,"selenium");
		
		System.out.println(ob3);
		System.out.println(ob2.equals(ob3));
		System.out.println(ob3.equals(ob2));
		
		
		System.out.println(ob2.hashCode());
		System.out.println(ob3.hashCode());
		Developer ob4=new Developer(3,"t",766,"JAVA");
		Developer ob5=new Developer(3,"t",766,"JAVA");
		System.out.println(ob4);
		System.out.println(ob5);
		System.out.println(ob4.equals(ob5));
		System.out.println(ob5.equals(ob4));
		System.out.println(ob4.hashCode());
		System.out.println(ob5.hashCode());
		
		

	}

}
