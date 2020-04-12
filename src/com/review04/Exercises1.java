package com.review04;

import java.util.Scanner;

public class Exercises1 {
public static void main(String[] args) {
	//Use Scanner to ask for the size of the array
	//then read numbers from the scanner into the array
//	Then print the whole array
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter how many elements you want?");
	int size=scan.nextInt();
	
	
	//Im creating an arraywith size =whatever she give us
	int[] nums=new int[size];
	
	for(int i=0; i<size; i++) {
		System.out.println("Give me a number to store in array!");
		nums[i]=scan.nextInt();
	}
	
	System.out.println("Let's see what you gave me:");
	//this enhanced for loop reads numbers from the array
	for(int n:nums) {
		System.out.println(nums);
	}
}
}
