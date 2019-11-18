package com.interfaceprog;

public class ATMMachine {

	public static void main(String[] args) {
		ATM atm=new ATMImp();
		atm.deposit(-1000);
		atm.checkBalance();
		atm.withdrawal(10000);
		atm.checkBalance();
		
		
		
		// TODO Auto-generated method stub

	}

}
