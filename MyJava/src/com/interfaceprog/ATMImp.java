package com.interfaceprog;

public class ATMImp implements ATM {
	long balance;
	@Override
	public void deposit(long deposit)
	{
		if(deposit>0)
		{
			balance=balance+deposit;
		}
		else
			System.out.println("invalid amount");
	}
	
	public long checkBalance()
	{
		System.out.println(balance);
		return balance;
	}

	public void withdrawal(long withdrawamt)
	{
		if(withdrawamt<=balance)
		{
			balance=balance-withdrawamt;
			System.out.println(withdrawamt);
			
		}
		else
			System.out.println("invalid");
	}
}
