package com.assign;

public class CC {

	public static void main(String[] args) {
		
		Emp e1=new Emp(1,"A",8735);
		TestEngineer t1=new TestEngineer(21,"B1",5774,"selenium");
		TestEngineer t2=new TestEngineer(21,"B1",5774,"selenium");
		Developer d1=new Developer (32,"C2",65.7,"C");
		Developer d2=new Developer (32,"C2",65.7,"C");
		System.out.println(t1.equals(t2));
		System.out.println(t2.equals(t1));
		System.out.println(d1.equals(d2));
		System.out.println(d2.equals(d1));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	
		
		
		// TODO Auto-generated method stub

	}

}
