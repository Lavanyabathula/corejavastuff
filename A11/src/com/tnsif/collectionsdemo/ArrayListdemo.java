package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListdemo {
	//primitive data
	int a;

	public static void main(String[] args) {
        
	    LinkedList<Integer> al=new LinkedList<Integer>();
	    //List al=new LinkedList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
		
		System.out.println(al);
		al.remove(5);
		System.out.println("After remove");
		System.out.println(al);

		
	}

}
