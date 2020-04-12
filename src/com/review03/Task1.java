package com.review03;

public class Task1 {

	public static void main(String[] args) {
		//print numbers from 15 to 35
		//but don't print numbers are divisible by 2 and 3
		for(int i=15; i<=35; i++) {
			//if(i%2==0 && i%3==0) {
			//	continue;
			//}System.out.println(i);
			//2nd way, using or
			if(i%2!=0 || i%3!=0) {
				System.out.println(i);
				continue;
			}
		}
	}

}
