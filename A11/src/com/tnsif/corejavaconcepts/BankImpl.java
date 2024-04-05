package com.tnsif.corejavaconcepts;

interface RBI{
	void rateofinterest();
}
interface bank1{
	void nwithdrawlimit();
}
class Hdfc implements RBI,bank1{

	@Override
	public void rateofinterest() {
		System.out.println("The rate of interest for hdfc is 8.5");
	}

	@Override
	public void nwithdrawlimit() {
		
	}
	
}

class Axis implements RBI{

	@Override
	public void rateofinterest() {
		System.out.println("The rate of interest for hdfc is 9.5");

	}
	
}


public class BankImpl{

	
	
	public static void main(String[] args) {

         BankImpl ob=new BankImpl();
         //Bank ob=new BankImpl();
        
         
         
	}

	
}
