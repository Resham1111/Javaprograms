package com.arraylistsprograms;
import java.util.ArrayList;
import java.util.Collections;


public class AL15 {

	public static void main(String[] args) {
		ArrayList <P1> al=new ArrayList <> ();
		
	al.add(new P1(10));
	al.add(new P1(4));
	al.add(new P1(7));
	System.out.println("before sorting");
	System.out.println(al);
	System.out.println("after sorting");
	Collections.sort(al);
	System.out.println(al);
	System.out.println("*******");
	System.out.println(new P1(10).compareTo(new P1(4)));
	System.out.println(new P1(4).compareTo((new P1(7))));
	
		
		
		

	}

}
