package com;

public class Student {

	String name;
	int age;

	void show() {

		System.out.println("Non static Method Calling .");

	}

	void gets() {

		show();
	}

	public Student() {
		show();
		System.out.println("Constructor Caling .");
	}

	public static void main(String[] args) {

		Student st = new Student();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		st.show();

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		new Student().show();

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		st.gets();

	}

}
