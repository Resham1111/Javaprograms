package com.arraylistsprograms;
//create arraylist add elements and use the elements in different ways

//for each
//get()
//iterator()

//1st step import

import java.util.ArrayList;
import java.util.Iterator;

public class AL11 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		//al.add("hello");
		System.out.println(al);
		System.out.println("******");
		
		//display using get()
		
		for(int i=0;i<al.size();i++)
		{
			//System.out.println(al.get(i)+5);cte...//get() returns object type
			Object ob=al.get(i);
			Integer k=(Integer)ob;
			System.out.println(k+70);
	
					
		}
		System.out.println("^^^^^^^^^^^^^^^");
		//displaying using for each
		
		for(Object c:al)
		{
			//System.out.println(c+6);............cte
			Integer g=(Integer)c;//downcasting
			System.out.println(g+7);
			
		}
		System.out.println("&&&&&&&&&&&&");
		
		//display using iterator()
		
		Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			
			System.out.println((Integer)i.next()+5);//downcasting
		}
		
		System.out.println("$$$$$$$$$$$$$$");
		
		
	
	}

}

