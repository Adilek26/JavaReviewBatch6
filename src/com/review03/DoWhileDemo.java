package com.review03;

public class DoWhileDemo {
public static void main(String[] args) {
	//Similarty between while && do-while
	int age =0; //just burn
	
	while(age<10) {
		age++;
		System.out.println("Happy Birthday! You are "+age+" years old.");
		
	}System.out.println("Now you are grown! You don't need a bithday celebration.");
	
	int age2=0; //just born my second son
	do {
		age2++;
		System.out.println("Happy Birthday! You are "+age2+" years old.");
		
	}while(age2<10);
	System.out.println("Now you are grown! You don't need a bithday celebration.");
	
	//Difference between while && do-while
	String greeting="Hi";
	boolean happy = false;
	while(happy) {
		System.out.println(greeting+" inside while");
	}
	do {
		System.out.println(greeting+" inside do-while");
	}while(false);
	
}
}
