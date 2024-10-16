package FourAssigment;
import java.util.Scanner;
public class Example10 {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter Side of Square");
	double side = Sc.nextDouble();
	double area = side*side;
	System.out.println("Area of Square is : "+area);
}
}
