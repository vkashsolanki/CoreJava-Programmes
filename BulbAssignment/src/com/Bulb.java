package com;

import java.util.Scanner;

public class Bulb {

	static int watt;
	static float price;
	static String color;
	boolean state;
	static int counter;
	static String name;

	public Bulb(int watt, float price, String color, String name) {

		this.watt = watt;
		this.price = price;
		this.color = color;
		this.state = state;
		this.counter = counter;
		this.name = name;
	}

	static void showDetails() {
		//changeCompanyName();
		System.out.println("Bulb's Watt is =>>   " + watt);
		System.out.println("Bulb's Price is=>>    " + price);
		System.out.println("Bulb's color is=>>    " + color);
		System.out.println("Bulb 's Company Name=>>   "+ name);

	}

	void changeState(boolean k) {
		state = k;
		if (state = k) {
			System.out.println("Bulb is On =>> " + state);
		}
		System.out.println("Bulb's state OFF =>>    ");

	}

	static void countBulb(int i) {
		counter = i++;
		System.out.println("Bulb's counter is =>>   " + counter);

	}

	 static void changeCompanyName() {
		// String name = cname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bulb company name");
		String n = sc.next();
		if (n.equals("Surya")) {
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			showDetails();
		}
		else if(n.equals("Philips")) {
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			showDetails();
		} else if(n.equals("Syska")) {
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			showDetails();
		} else {
			System.out.println("Please enter correct Company Name");

		}

	}

	public static void main(String[] args) {
		changeCompanyName();
		Bulb b = new Bulb(46, 36, "Blue", "Syska");
		
		changeCompanyName();
		Bulb b1 = new Bulb(16, 26, "White", "Surya");
		//b1.changeCompanyName();
		changeCompanyName();
		Bulb b2 = new Bulb(36, 96, "Yellow", "Philips");
		//b2.changeCompanyName();

	}

}
