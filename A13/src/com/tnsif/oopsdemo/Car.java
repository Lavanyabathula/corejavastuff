package com.tnsif.oopsdemo;

public class Car {
 //method overriding -- it has common method signature (runtime polymorphism)
	void steering() {
		System.out.println("it's not auto steering");
	}
	
	void engine() {
		System.out.println("power engine");
	}
	
}
class Benz extends Car{
	
	void steering() {
		System.out.println("it's auto steering");
	}
	
	void engine() {
		System.out.println("1500rpm power engine");
	}
	
}
