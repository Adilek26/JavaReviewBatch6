package com.review02;

public class SwitchCapitalCity {
public static void main(String[] args) {
	String country="Turkey";
	String cc="";
	
	switch(country) {
	case "US":
		cc="Wasington Dc";
		break;
	case "Russia":
		cc="Moscow";
		break;
	case "China":
		cc="Beijing";
		break;
	case "Albania":
		cc="tirana";
		break;
	case "Pakistan":
	   cc="Islamabad";
	break;
	case "Turkey":
		cc="Ankara";
		break;
	default:
		cc="not in my list";
		break;
		
	}System.out.println("The capital city of "+ country+" is "+cc);
}
}
