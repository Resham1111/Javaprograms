package com.encapsulation;

public class EmpPortal {

	public static void main(String[] args) {
		Employee e=new Employee(1,"resh",10.0);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		e.setSalary(100.0);
		System.out.println(e.getSalary());
		
		// TODO Auto-generated method stub

	}

}
