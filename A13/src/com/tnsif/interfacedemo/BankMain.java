package com.tnsif.interfacedemo;


public class BankMain {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount("Lavanya","Bangalore",102,25000.89f);
		System.out.println(sa);
		
		sa.deposit(12000);
		System.out.println(sa);
		
		sa.withdraw(16000);
		System.out.println(sa);


		
	}

}
