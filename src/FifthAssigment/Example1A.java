package FifthAssigment;

public class Example1A {

	private void m1()
	{
		System.out.println("M1-Private");
	}
	void m2()
	{
		System.out.println("M2-Default");
	}
	protected void m3()
	{
		System.out.println("M3-Protedted");
	}
	public void m4()
	{
		System.out.println("m4-Public");
	}
	
	public static void main(String[] args) {
		Example1A e1 = new Example1A();
		e1.m1();
		e1.m2();
		e1.m3();
		e1.m4();
	}
}
