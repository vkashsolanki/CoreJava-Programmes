package com;

public class Animal {

	static void bark() {
		System.out.println("Dogs are Barking ");
	}

	static Animal roars() {

		System.out.println("Lion are Roarsing");
		bark();
		return new Animal();
	}

	public static void main(String[] args) {
		System.out.println("First Approach .......");
		bark();

		System.out.println("Second Approach .......");
		Animal.bark();

		System.out.println("Third Approach .......");
		Animal a = new Animal();
		a.bark();

		System.out.println("Fourth Approach .......");
		Animal s = new Animal().roars();

	}

}
