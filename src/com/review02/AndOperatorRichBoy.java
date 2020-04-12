package com.review02;

import java.util.Scanner;

public class AndOperatorRichBoy  {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Are you a boy or a girl?");
		String boyGirl=input.next();
		System.out.println("You entered "+boyGirl);
		System.out.println("Are you rich true/false?");
		boolean rich=input.hasNextBoolean();
		System.out.println("You are a  "+boyGirl+" and you are rich: "+rich);
		String result;
		
		if (boyGirl.equals("boy") && rich) 
			// only if rich boy
			result="Buy a ferrari.";
		 else if (boyGirl.equals("boy") && !rich) 
			// only poor boy
			result="Play sports";
		 else if (boyGirl.equals("girl") && rich) 
			// only rich girl
			result="Buy Louis Vuitton";
		 else if (boyGirl.equals("girl") && !rich) 
			// only poor girl
			result="Read a book";
		 else 
			// neither boy or girl
		result="You entered wrong choice.";
		System.out.println(result);
	}

}
