package SevenAssigment;

public class Example6Child {
Example6Child()
{
	System.out.println("Constcutor of Child Class");
}
Example6Child(int num)
{
	System.out.println("Constructor with value");
}

void display()
{
	System.out.println("Hello");
}

public static void main(String[] args) {
	Example6Child e6 = new Example6Child();
	e6.display();
	Example6Child e7 = new Example6Child(10);
	e7.display();
}
}
