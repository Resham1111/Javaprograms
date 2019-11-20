package com.assignmentprogs;

public class Emp2 implements Comparable
{
	int id;
	String name;
	Emp2()
	{
		
	}
	Emp2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "[id = " +id + " " + "name =" + name + "]";
		
	}
	/*
	public int compareTo(Object ob)
	{
		return this.id-(((Emp2)ob).id);
		
	}
	*/
	public int compareTo(Object ob)
	{
		return this.name.compareTo(((Emp2)ob).name);
		
	}
	
	

}
