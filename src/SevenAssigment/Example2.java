package SevenAssigment;

public class Example2 {

	Example2()
	{
		System.out.println("Default Constructor");
	}
	Example2(int a)
	{
		System.out.println("Parameterized Constructor"+a);
	}
	
	public static void main(String[] args) {
		Example2 e1 = new Example2();
		Example2 e2 = new Example2(5);
	}
}

