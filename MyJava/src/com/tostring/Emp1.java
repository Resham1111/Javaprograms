package com.tostring;

public class Emp1 {
	int id;
	String name;
	
	double salary;
	
	Emp1()
	{
		
	}
	Emp1(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id+ " "+name+ " "+salary;
	}

}
