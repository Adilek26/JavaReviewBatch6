package com.bach.java;

public class VariableAdileDemo {
public static void main(String[] args) {
	//Declare the variable
	String firstName;
	//Assign a value
	firstName="Jhon";
	System.out.println();
	//Declare the variable & assign a value
	String lastName="Smith";
	
	int age=32;
	System.out.println(firstName+" "+lastName+ " is "+age +" years old.");
	
	System.out.println(firstName+" " +lastName);
	//reassign a new value
	lastName="Watson";
	System.out.println("after getting married :");
	System.out.println(firstName+" "+lastName +" is "+age +" years old.");
}
}
