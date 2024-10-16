package Polymorphism;

public class Student {
	int id;
	String name;
	int marks;

	Student() {
		System.out.println("Zero Para Constructor");
	}

	Student(int i) {
		System.out.println("One Para Constructor" + i);
	}

	Student(int i, String nm) {
		System.out.println("Two Para Constructor" + i + nm);
	}

	Student(int i, String nm, int m) {
		System.out.println("Three Para Constructor" + i + nm + m);
	}

	void m1() {
		System.out.println("Zero Para Constructor");
	}

	void m1(int i) {
		System.out.println("One Para Constructor" + i);
	}

	void m1(int i, String nm) {
		System.out.println("Two Para Constructor" + i + nm);
	}

	void m1(int i, String nm, int m) {
		System.out.println("Three Para Constructor" + i + nm + m);
	}

}
