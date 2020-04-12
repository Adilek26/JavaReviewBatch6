package com.review04;

import java.util.Scanner;

public class MotherFatherName {

	public static void main(String[] args) {
		// Write a program that reads two people’s first names and if they expecting boy or girl?
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY
//
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? girl
//		Suggested baby name: MAIEL
Scanner scan=new Scanner(System.in);
System.out.println("Please enter Mom's and Dad's name");
String mom=scan.next();
String dad=scan.next();
String name1;
String name2;
System.out.println("What is the baby's gender");
String gender=scan.next();
if(gender.equalsIgnoreCase("girl")) {
	name1=mom.substring(0,mom.length()/2)+dad.substring(dad.length()/2);
	System.out.println(name1);
}else if(gender.equalsIgnoreCase("boy")) {
	name2=dad.substring(0,dad.length()/2)+mom.substring(mom.length()/2);
	System.out.println(name2);
}
	}

}
