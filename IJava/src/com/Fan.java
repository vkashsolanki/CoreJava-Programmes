package com;

public class Fan {

	// caling static data member

	static String cname;
	static int price;

	public static void main(String[] args) {

		System.out.println("First approach");
		cname = "Philips";
		System.out.println(cname);
		price = 4500;
		System.out.println(price);

		System.out.println("Second approach");
		Fan.cname = "Surya";
		Fan.price = 6000;
		System.out.println(cname);
		System.out.println(price);

		System.out.println("Third approach");
		Fan f = new Fan();
		f.cname = "Konarks";
		f.price = 9600;
		System.out.println(cname);
		System.out.println(price);

		System.out.println("Fourth approach");
		System.out.println(new Fan().cname = "Wipro");
		System.out.println(new Fan().price = 7800);

		System.out.println("+++++++++++++++++++++");
		System.out.println(cname);
		System.out.println(price);

	}

}
