package com.arraylistsprograms;

public class P1 implements Comparable
{
	int i;
	P1()
	{
		
	}
	P1(int i)
	{
		this.i=i;
		
				
	}
	
	public String toString()
	{
		return "P1 [i=" + i + "]";
		
				
	}
	public int compareTo(Object ob)
	{
		return this.i-(((P1)ob).i);
		
	}
	

}
