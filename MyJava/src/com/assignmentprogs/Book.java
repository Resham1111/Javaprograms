package com.assignmentprogs;

public class Book {
	String name;
	int price;
	int isbn;
	
	Book()
	{
		
	}
	
	Book(String name,int price,int isbn)
	{
		this.name=name;
		this.price=price;
		this.isbn=isbn;
	}
	void genre(String genre)
	{
		System.out.println( name + "is in " + genre + "genre");
	
	}
	

}
