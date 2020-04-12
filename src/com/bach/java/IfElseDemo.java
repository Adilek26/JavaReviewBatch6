package com.bach.java;

public class IfElseDemo {
public static void main(String[] args) {
	boolean tired=false;
	if(tired) {
		System.out.println("Go to sleep");
	}else {
		System.out.println("Study more!");
		int num1=10;
		int num2=15;
		if(num1>num2) {
	System.out.println(num1);
		}else if(num2>num1){
			System.out.println(num2);
		}else {
			System.out.println("they are equal");
		}
	}
}
}
