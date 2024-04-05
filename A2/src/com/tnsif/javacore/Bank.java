package com.tnsif.javacore;

class Yes implements RBI,SuzBank{

	@Override
	public void rateofinterest() {
		 System.out.println("the rate of interest for Yes bank is 8%");
	}
	public void display() {
		System.out.println("this is from yes bank");
	}
	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
	
}
class HDFC implements RBI{

	@Override
	public void rateofinterest() {
		 System.out.println("the rate of interest for HDFC bank is 10%");
		
	}
	
}

public class Bank {

	public static void main(String[] args) {
      Yes obj=new Yes();
      obj.rateofinterest();
      obj.display();
      HDFC ob=new HDFC();
      ob.rateofinterest();
		
		
		
	}

}
