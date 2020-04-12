package com.review03;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	// Ask user enter a positive number and add it to the total
	//He shoul enter -1 to stop. -1 will not be added to the total
	Scanner scan=new Scanner(System.in);
	int number=0;
	int totl=0;
	while(number >=0){
	System.out.println("Enter a number . To Stop enter -1");
	 number=scan.nextInt();
	 if(number==-1) {
		 break;
	 }
	 number++;
		totl=number+totl;
		
	 }System.out.println("The total is ="+ totl);
	
	
	}
	 
}

