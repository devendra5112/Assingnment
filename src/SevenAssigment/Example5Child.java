package SevenAssigment;

public class Example5Child extends Example5Parent {

	void display()
	{
		System.out.println("Child Class Method");
	}
	
	void print()
	{
	super.display();	
	}
	public static void main(String[] args) {
		Example5Child e5 = new Example5Child();
		e5.print();
	}
}
