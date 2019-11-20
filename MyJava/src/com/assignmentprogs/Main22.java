package com.assignmentprogs;
import java.util.ArrayList;
import java.util.Collections;


public class Main22 {

	public static void main(String[] args) {
		                            //creating arraylist objects
		ArrayList <Dev2> d=new ArrayList <> ();
		ArrayList <TE2> t=new ArrayList<> ();
		
		                           //adding objects of dev
		d.add(new Dev2(6,"faesham"));
		d.add(new Dev2(2,"cesh"));
		d.add(new Dev2(9,"bre"));
	                            	//adding objects of te
		t.add(new TE2(10,"zbuli"));
		t.add(new TE2(100,"yjuli"));
		t.add(new TE2(105,"xguli"));
		
		                            //displaying  the unsorted objects
		System.out.println("before sorting");
		System.out.println(d);
		System.out.println(t);
		System.out.println("after sorting");
		
		                            //sorting the objects in ascening order
		Collections.sort(d);
		Collections.sort(t);
		
		                            //displayimg the sorted objects
		System.out.println(d);
		System.out.println(t);
		
		
		
		
		
 
	}

}
