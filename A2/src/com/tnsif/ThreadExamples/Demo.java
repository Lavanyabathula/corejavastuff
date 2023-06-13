package com.tnsif.ThreadExamples;
class Sample1{
	public void square() throws InterruptedException {
		for(int i=0;i<5;i++) {
			Thread.sleep(2000);
			System.out.println("square number"+(i*i));
		}
	}
}
class Sample2{
	public void doubleNo() throws InterruptedException {
		for(int i=0;i<5;i++) {
			Thread.sleep(2000);
			System.out.println("square number"+(i*2));
		}
	}
}
public class Demo {

	public static void main(String[] args) throws InterruptedException {
        Sample1 s1=new Sample1();
        Sample2 s2=new Sample2();
        s1.square();
        s2.doubleNo();
        
	}

}
