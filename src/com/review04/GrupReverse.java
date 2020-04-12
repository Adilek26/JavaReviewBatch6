package com.review04;

public class GrupReverse {

	public static void main(String[] args) {
		// reverse the string
		String aksam="Aksam";
		String reverse="";
		
		for(int i=aksam.length()-1; i>=0; i--) {
			reverse=reverse+aksam.charAt(i);
		}
System.out.println(reverse);
	}

}
