package com;

public class Employee {

	String name;
	int age;

	void getMethod() {
		name = "Mohan";
		age = 46;
		System.out.println(name + " " + age);
	}

	void getFuntion(String name, int age) {
		name = name;
		age = age;
		System.out.println(name + " " + age);
	}

	public Employee() {
		name = "Ranjan tiwari";
		age = 28;
		System.out.println("********constructor+++++++++++++++++++++ ");
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {

		System.out.println("Call non- static method first approach");
		Employee emp = new Employee();
		System.out.println("+++++++++++++++++++++++++++first approach");

		System.out.println(emp.age = 45);
		System.out.println(emp.name = "Ram");
		System.out.println("++++++++++++++++++++++++++++Second approach");
		System.out.println(new Employee().age = 12);
		System.out.println(new Employee().name = "Shyam");
		System.out.println("+++++++++++++++++++++++++++++ Third Approach");
		int ages = new Employee().age = 16;
		System.out.println(ages);
		String names = new Employee().name = "SitaJi";
		System.out.println(names);
		System.out.println("+++++++++++++++++++++++++++++ Approach One");
		Employee n = new Employee();
		n.getMethod();
		System.out.println("+++++++++++++++++++++++++++++ Approach two");
		Employee e = new Employee();
		e.getFuntion("Kunda", 50);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

	}

}
