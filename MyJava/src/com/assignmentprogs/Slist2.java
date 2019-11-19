package com.assignmentprogs;

public class Slist2 {

	public static void main(String[] args) {
		Song1[] p1=new Song1[2];
		
		
		p1[0]=new Song1("as",7589);
		
		p1[1]=new Song1("jhj",987);
		
		for(int i=0;i<p1.length;i++)
		{
			System.out.println(p1[i]);
			System.out.println(p1[i].name + " " + p1[i].like);
		}
		
		
				
		// TODO Auto-generated method stub

	}

}
