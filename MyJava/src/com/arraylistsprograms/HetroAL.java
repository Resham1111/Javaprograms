package com.arraylistsprograms;
import java.util.ArrayList;


public class HetroAL {

	public static void main(String[] args) {
		ArrayList hetro =new ArrayList();
		hetro.add(new Bike("red",120));
		
		hetro.add(new Employee1("resh",12));
		Movie m=new Movie("bala",4.5);
		System.out.println(m);
		hetro.add(m);
		hetro.add(10);
		System.out.println(hetro);
		
		for(int i=0;i<hetro.size();i++)
		{
			Object x=hetro.get(i);
			if(x instanceof Bike)
			{
			
			System.out.println(((Bike)x).color);
			System.out.println(((Bike)x).mileage);
			}
			
			
			if(x instanceof Employee1)
			{
				System.out.println(((Employee1)x).id);
				System.out.println(((Employee1)x).name);
				
			}
			
			if(x instanceof Movie)
			{
				System.out.println(((Movie)x).name);
				System.out.println(((Movie)x).rating);
				
			}

				
				
				
				if (x instanceof Integer)
			{
				System.out.println((Integer)x + 12);
				
			}
			System.out.println("************");
		}
		
		
		
		

	}

}
