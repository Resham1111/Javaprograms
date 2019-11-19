package com.assignmentprogs;

public class Bookstore {

	public static void main(String[] args) {
		Book B1=new Book("ABC",8786,897753);
		Book B2= new Book("JHF",76587,7475);
		Book B3= new Book("JHjh",7627,24575);
		
		Book [] B= {B1,B2,B3};
		
		for(Book ob:B)
		{
			System.out.println(ob.name + " " + ob.price + " " +ob.isbn);
			ob.genre("thriller");
			
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
