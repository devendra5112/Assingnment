package Abstraction;

public class Example2Child extends Example2Parent {
	int x,y,z;
	void get(int a,int b)
	{
		x=a;
		y=b;
	}
	void add()
	{
		z=z+y;
	}
	void display()
	{
		System.out.println("The Addition is : "+z);
	}

}
