package com.bach.java;

import java.util.Scanner;

public class Task002 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your age");
	int age=scan.nextInt();
	System.out.println("The age is "+age);
	//if you use space between numbers 
	//it reads just before the space
	if(age<10) {
		System.out.println("You are too young");
	}else if(age<=20){
		
	}
}
}
