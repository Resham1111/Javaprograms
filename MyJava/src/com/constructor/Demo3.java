package com.constructor;

public class Demo3 {
	Demo3(){
		
		System.out.println("from demo3()");
		
		
	}
	Demo3(int i){
		System.out.println("from d3");
		
		
	}
	Demo3(double k)
	{
		System.out.println(k);
		
	}
	public static void main(String[] args) {
		Demo3 ob = new Demo3();
		Demo3 ob1= new Demo3(10);
		Demo3 ob2 = new Demo3(10.0);
		
		
	}
	

}
