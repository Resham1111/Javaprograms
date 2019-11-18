package com.arraylistsprograms;

public class Movie {
String name;
double rating;

Movie()
{
}


 Movie(String name,double rating)
 {
	 this.name=name;
	 this.rating=rating;
	 
 }
 
 public String  toString()
 {
	 return "[movie details :" + name + ","+rating + "]";
	 
 }
}
