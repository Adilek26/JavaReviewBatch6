package com.review02;

import java.util.Scanner;

public class IfElseIfMonthScanner {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number for the month: ");
		int month=input.nextInt();
		String ymonth;
		if(month==1) {
			ymonth="January";
		}else if(month==2) {
		ymonth="February";
	    }else if(month==3) {
	    ymonth="March";
	    }else if(month==4) {
		ymonth="April";
	    }else if(month==5) {
	    	ymonth="May";
	    }else if(month==6) {
	    	ymonth="June";
	    }else if(month==7) {
	    	ymonth="July";
	    }else if(month==8) {
	    	ymonth="August";
	    }else if(month==9) {
	    	ymonth="September";
	    }else if(month==10) {
	    	ymonth="October";
	    }else if(month==11) {
	    	ymonth="November";
	    }else if(month==12) {
	    	ymonth="Decenber";
	    }else  {
	    	ymonth="Invalid";
	    	System.out.println();
	}System.out.println("The month is "+ymonth);
	System.out.println("We are done");
}

}
