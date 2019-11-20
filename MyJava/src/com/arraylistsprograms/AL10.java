package com.arraylistsprograms;
//with generics type integer


//import first
import java.util.ArrayList;
import java.util.Iterator;



public class AL10 {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al =new ArrayList <> ();
		al.add(10);
		al.add(288);
		al.add(54);
		System.out.println(al);//tostring() is already overriden so we the elements
		System.out.println("*****************");
		
		///displayin elements
		
		Iterator <Integer>i= al.iterator();//calling the iterator method it returns the iterator object
		//inside i reference of iterator is stored
		
		System.out.println(i);
		System.out.println("*************#");
		
		
		while(i.hasNext())//returns true if element is present in iterator object
		{
			Integer x=i.next();//returns the element of the iterator object
			
			System.out.println(x);
			System.out.println(x+3);
			System.out.println("******");
		}
	
		
		
	}
	

}
