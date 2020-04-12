package com.review03;

public class TaskFor {

	public static void main(String[] args) {
		int sumEven=0;
		int sumOdd=0;
		int sum=0;
		
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			sum+=i;
		}
		System.out.println("Sum of odds "+sumOdd);
			System.out.println("Sum evens "+sumEven);
		System.out.println(sum);
	}

}
