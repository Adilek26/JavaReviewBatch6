package com.review02;

import java.util.Scanner;
public class NestedIfRichBoy{
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Are you a boy or a girl?");
		String boyGirl=input.next();
		System.out.println("You entered "+boyGirl);
		System.out.println("Are you rich true/false?");
		boolean rich=input.hasNextBoolean();
		System.out.println("You are a  "+boyGirl+"and you are rich: "+rich);
		if(boyGirl.contentEquals("boy")){
				//boy
			System.out.println("Yaaaaay");
			if(rich) {
			System.out.println("Buy a Ferrari.");
		    }else {
			//poor boy
			System.out.println("Play sports");
		}
	 }else if(boyGirl.contentEquals("girl")) {
		//girl
		System.out.println("Yay");
	    if(rich) {
		System.out.println("buy Luis Vuitton");
	   }else {
		//poor girl
		System.out.println("Read a book");
	   }
	}else {
		System.out.println("You entred wrong choice. ");
		}
	
	  System.out.println("We are done");
	
	}

}
