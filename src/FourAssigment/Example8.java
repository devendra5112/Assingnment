package FourAssigment;
import java.util.Scanner;
public class Example8 {
static Scanner Sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the radius");
	double radius = Sc.nextDouble();
	double area = Math.PI*(radius*radius);
	System.out.println("The area of Circle is : "+area);
	double circumference = Math.PI*2*radius;
	System.out.println("The Circuference of the circle is : "+circumference);
}
}
