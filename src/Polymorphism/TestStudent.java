package Polymorphism;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(13);
		Student s3 = new Student(13, "TKA");
		Student s4 = new Student(13, "TKA", 89);
		s1.m1();
		s1.m1(11);
		s1.m1(11, "JBK");
		s1.m1(11, "JBK", 90);
	}
}
