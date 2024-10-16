package SecondAssigment;

public class Example4 {

	boolean b=true;
	void check()
	{
		if(b==true)
		{
			b=false;
			System.out.println("The Boolean VAlue is : "+b);
		}
	}
	
	
	public static void main(String[] args) {
		Example4  e4 = new Example4();
		e4.check();
		System.out.println(e4.b);
	}
}
