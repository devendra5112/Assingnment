package EightAssigment;

public class MultiZ extends MultiY {

	public void C()
	{
		System.out.println("Z Class Method");
	}
	
	public static void main(String[] args) {
		MultiZ z1 = new MultiZ();
		z1.A();
		z1.B();
		z1.C();
	}
}
