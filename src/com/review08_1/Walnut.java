package com.review08_1;

public class Walnut extends Fruit implements Crackable {

	public Walnut(String color) {
		super(color);
	}

	@Override
	public void crack() {
		System.out.println("Let's crack the walnut");
	}

	@Override
	public void eat() {
		System.out.println("Let's eat the walnut");
	}



}
