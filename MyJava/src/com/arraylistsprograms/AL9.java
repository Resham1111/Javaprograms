package com.arraylistsprograms;

//without generics
import java.util.ArrayList;
import java.util.Iterator;



public class AL9 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList ();
		al.add(10);
		al.add("hello");
		al.add(30);
		Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			Object ob=i.next();
			if(ob instanceof Integer)
			{
				Integer x=(Integer)ob;
				System.out.println(x);
				
				System.out.println(x+2);
				System.out.println("*******");
				
			}
			if(ob instanceof String)
			{
				String v=(String)ob;
				System.out.println(v);
				System.out.println(v + "world");
				System.out.println("**********");
				
				
				
	
			}
			}
			
		}
		
		
		
		
		
		
	}


