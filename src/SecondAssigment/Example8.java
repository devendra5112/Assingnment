package SecondAssigment;

public class Example8 {

	double getArea(double x,double y)
	{
		return x*y;
	}
	
	public static void main(String[] args) {
		Example8 e8 = new Example8();
		double z = e8.getArea(12.25, 25.19);
		System.out.println(z);
	}
	
}
