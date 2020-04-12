package com.review04;

public class ArrayMaxMin {
//Find maximum & minimum number in an array
	public static void main(String[] args) {
		int []numbers= {34,67, 3,93,56,72,17,33};
		
		int largest= numbers[0];
		int smalest=numbers[0];
		int sum=0;
		
		
		for(int num:numbers) {
			if(num>largest) {
				largest=num;
			}
			if(num<smalest) {
				smalest=num;
			}
			sum+=num;
		}

		System.out.println("Largest number is :"+largest);
		System.out.println("Smalest number is :"+smalest);
		System.out.println("Total number is :"+sum);
		
	}
}
