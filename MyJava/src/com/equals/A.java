package com.equals;

public class A {
	int i;
	double j;
	A()
	{
		
	}
A(int i,double j)
{
	this.i=i;
	this.j=j;
}

public boolean equals(Object ob)
{
	
	A temp=(A)ob;
	return this.equals(temp);
}
}
