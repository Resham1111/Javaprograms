package com.staticmembers;

public class Marker {
	static int price;
	static String colour;
	
	static void writing ()
	{
		
	
	System.out.println("the marker of colour "+ colour + " is writing");
	}
		// TODO Auto-generated method stub

class Shop{
	
}

	public static void main(String[] args) {
		System.out.println(Marker.colour);
		System.out.println(Marker.price);
		Marker.price=100;
		Marker.colour="blue";
		Marker.price=20;
		Marker.colour="red";
		System.out.println("marker colour "+ Marker.colour +" marker price" + Marker.price);
		
		// TODO Auto-generated method stub
		Marker.writing();

	}

}
