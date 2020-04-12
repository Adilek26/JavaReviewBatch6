package com.review03;

public class ContinueDemo {
public static void main(String[] args) {
	//I want to celebrete my son's 20 bithdays
	//but not 13th birthday
	//leet use for loop
	
	for(int age=1;age<=20; age++) {
		//1st way
	//	if(age!=13) {
	//System.out.println("Happy bday! You are "+age+ " Years old");
		//}
		
	//2nd way
	//	if(age==13) {
	//		continue;}
//	System.out.println("Happy bday! You are "+age+ " Years old");
		
		
		//3rd way
		if(age==13) {
			
		}else {
			System.out.println("Happy bday! You are "+age+ " Years old");
		}
	}
	}
}
