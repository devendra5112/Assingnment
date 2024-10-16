package SevenAssigment;

public class Example4Child extends Example4Parent {
int num=110;
void print()
{
	System.out.println(super.num);
}

public static void main(String[] args) {
	Example4Child c1 = new Example4Child();
	c1.print();
}
}
