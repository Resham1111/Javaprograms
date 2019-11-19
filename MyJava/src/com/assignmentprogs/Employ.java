package com.assignmentprogs;



public class Employ {
	int id;
	String name;
	double salary;
	
	Employ(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	
	}
	
	static	Employ createEmploy(int id,String name,double salary)
	{
		return new Employ(id,name,salary);
		
	}
	
	
	Employ initialize(double salary)
	{
		this.salary=salary;
		return this;
		
	
	}
	
	Employ display()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		System.out.println("____________________");
		return this;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Employ.createEmploy(1,"A",29978.665).display();
		Employ.createEmploy(2,"Q",9786.674553).display().initialize(76987.87).display();
		// TODO Auto-generated method stub

	}

}
