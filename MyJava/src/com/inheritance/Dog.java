package com.inheritance;

public class Dog  extends Animal{
	String color;
	Dog()
	{
		
	}

 
	
	Dog(int height,int weight,String color)
   {
	super(height, weight);
	this.color=color;
   }
	
   
   public static void main(String[] args) {
	   Dog d=new Dog(23,45,"red");
	   System.out.println(d.height);
	   System.out.println(d.weight);
	   
	   
		// TODO Auto-generated method stub

	}

}
