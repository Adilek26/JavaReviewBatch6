package com.review03;

public class Task01 {
//Add even numbers
	//Add odd numbers
	//Between 1-50
	//Using while loop
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		int sum1=0;
		
     while(num<=50) {
	if(num%2==0) {
		sum1 += num;
	}else{
		sum += num;
	}num++;
	}
System.out.println("Sum of the odd numbers "+sum);
System.out.println("Sum of the even numbers "+sum1);
}
	}


