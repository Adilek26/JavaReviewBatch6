package com.review02;

import java.util.Scanner;

public class SwitchMonth {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number for the month: ");
	
	int month = input.nextInt();
	String ymonth="";

	switch(month) {
	case 1:
		ymonth="January";
	break;
	case 2:
	ymonth="February";
   break;
   case 3:
		ymonth = "March";
	break;
	case 4:
		ymonth = "April";
	break;
	case 5:
		ymonth = "May";
	break;
	case 6:
		ymonth = "June";
	break;
	case 7:
		ymonth = "July";
	break;
	case 8:
		ymonth = "August";
	break;
	case 9:
		ymonth = "September";
	break;
	case 10:
		ymonth = "October";
	break;
	case 11:
		ymonth = "November";
	break;
	case 12:
		ymonth = "Decenber";
	break;
	default:
		ymonth = "Invalid";
		

}System.out.println("The month is "+ymonth);
	}
}
