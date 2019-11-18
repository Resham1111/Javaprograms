package com.abstractclass;

public class Jungle {

	public static void main(String[] args) {
		/*Dog d=new Dog(12,56);
		d.talk();
		
		
		
		Lion l=new Lion(69,87);
		l.talk();
		System.out.println(l.height + " "+l.weight);
		*/
		// TODO Auto-generated method stub
		
		Animal a;
		a=new Dog(35,57);
		a.talk();
		System.out.println(a.height + " " +a.weight);
		
		a=new Lion(56,78);
		a.talk();
		System.out.println(a.height + " " +a.weight);
		

	}

}
