package SevenAssigment;

public class Example1 {
int value1;
int value2;

Example1()
{
	value1=10;
	value2=20;
	System.out.println("Inside first Constructor");
}
Example1(int a)
{
	value1=a;
	System.out.println("Inside Second Constructor");
}
Example1(int a,int b)
{
	value1=a;
	value2=b;
	System.out.println("Inside Third Constructor");
}

void display()
{
	System.out.println("Value 1 is : "+value1);
	System.out.println("Value 2 is : "+value2);
}
}
