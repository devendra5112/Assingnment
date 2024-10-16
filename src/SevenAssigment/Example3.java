package SevenAssigment;

public class Example3 {

	int value1;
	int value2;
	Example3()
	{
		value1=10;
		value2=20;
		System.out.println("Inside Constructor");
	}
	public void display()
	{
		System.out.println("Value 1 is : "+value1);
		System.out.println("Value 2 is : "+value2);
	}
	
	public static void main(String[] args) {
		Example3 e3 = new Example3();
		e3.display();
	}
}
