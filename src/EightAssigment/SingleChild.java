package EightAssigment;

public class SingleChild  extends Singleparent{
	public void B()
	{
		System.out.println("Child Class Method");
	}
	
	public static void main(String[] args) {
		SingleChild sc1 = new SingleChild();
		sc1.A();
		sc1.B();
	}

}
