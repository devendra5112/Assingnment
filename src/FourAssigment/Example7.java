package FourAssigment;
import java.util.Scanner;
public class Example7 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the lenght of Rectangle");
		double lenght = Sc.nextDouble();
		System.out.println("Enter the Width of Rectangle");
		double width = Sc.nextDouble();
		double area=lenght*width;
		System.out.println("Area of Recatangle is : "+area);
	}

}
