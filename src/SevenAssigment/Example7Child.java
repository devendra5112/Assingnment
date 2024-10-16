package SevenAssigment;

public class Example7Child extends Example7Parent {

	Example7Child()
	{
		super();
		System.out.println("Constuctor of Child Class");
	}
	void display()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Example7Child e7 = new Example7Child();
		e7.display();
	}
}
