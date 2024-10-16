package ThirdAssigment;
import java.util.Scanner;
public class Example1 {
public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter First Number");
	int num1 = Sc.nextInt();
	System.out.println("Enter Second Number");
	int num2 = Sc.nextInt();
	int sum = num1+num2;
	System.out.println("Sum is : "+sum);
}
}
