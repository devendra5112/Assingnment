package Polymorphism;

public class TestOverload {
	public static void main(String[] args) {
		Overload o1 = new Overload();
		double result;
		int add;
		o1.demo(10, 20);
		o1.demo(10);
		result = o1.demo(5.5);
		System.out.println("Result is  : " + result);

	}
}
