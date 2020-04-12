package com.review04;

public class ArrayDemo {
public static void main(String[] args) {
	int a1;
	a1=5;
	int a2=7;
	int a3=8;
	int a4=9;
	int a5=20;

/*	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);*/
	
	//1st profesional way
	//declaring an array, all elements have the defalt value
	int[] numbers=new int[5];
	//assigning for array elements
	numbers[0]=5;
	numbers[1]=7;
	numbers[2]=8;
	numbers[3]=9;
	numbers[4]=20;
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	System.out.println(numbers[2]);
	System.out.println(numbers[3]);
	System.out.println(numbers[4]);
	//printing the element with index 2,3th element
	System.out.println("print using index with variable");
	int i=2;
	System.out.println(numbers[i]);
	i++;
	System.out.println(numbers[i]);
	
	int arrayLength=numbers.length;
	System.out.println("The length of array is is :"+arrayLength);
	
	//a)method
	
	System.out.println("Reading from arrayusing for loop");
	for(int j=2; j<arrayLength; j++) {
		System.out.println(numbers[j]);
	}
	//b)method for each loop/advanced for loop/enhanced for loop
	//this method iterates the whole array
	System.out.println("Reading from array using for-each loop/advenced for loop/enhanced ");
	for(int number:numbers) {
		System.out.println(number);
	}
		//2nd pro way initializing array
		System.out.println("Second way using curly brackets");
		int[] numbers2= {4,6,8,9,15 };
		
		System.out.println(" Length is "+numbers2.length);
		
		for(int j=0; j<numbers2.length; j++) {
			System.out.println(numbers2[j]);
		}
		for(int number:numbers2) {
			System.out.println(number);
		}
	}
}

