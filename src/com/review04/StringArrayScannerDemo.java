package com.review04;

import java.util.Scanner;

public class StringArrayScannerDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("How many animals do you have?");
	int length=scan.nextInt();
	
	String[] animals =new String[length];
	for(int count=0; count<length; count++) {
	System.out.println("Give me an animal.");
	String animal=scan.next();
	animals[count]=animal;
	}
	System.out.println("--------------------");
	for(String str:animals) {
		System.out.println(str);
	}
	System.out.println("------------------------");
	System.out.println("Print in reverse order");
	for(int i=animals.length-1; i>=0; i--) {
		String str=animals[i];
		System.out.println(str);
		
	}
}
}
