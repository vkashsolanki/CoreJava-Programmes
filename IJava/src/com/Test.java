package com;

public class Test {

	String name;
	int age;

	{
		name = "Ravi";
		age = 25;
	}

	public void showStatic() {
		System.out.println(name);
		System.out.println(age);
	}

	public Test gem(Test t) {

		return new Test();
	}

	public static void hit(Test n) {

	}

	public static void main(String[] args) {
		System.out.println(new Test());
		new Test();
		System.out.println(new Test());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(new Test().age = 12);
		System.out.println(new Test().name = "Ram");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Test t = new Test();
		t.age = 45;
		t.name = "Shyam";
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(t.gem(new Test()));
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Test l = new Test();
		l.showStatic();

	}

}
