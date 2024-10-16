package Abstraction;

public class TestExample1 extends Example1 {
public void display2()
{
	System.out.println("I`M Overriding abstract Method");
}
public static void main(String[] args) {
	TestExample1  e1 = new TestExample1();
	e1.display2();
	e1.display1();
}
}
