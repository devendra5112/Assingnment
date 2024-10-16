package Array;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		int z[] = new int[10];
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter 10 Number for Array");
		System.out.println("Enter Array element");
		for (int i = 0; i < 10; i++) {
			z[i] = Sc.nextInt();
		}
		System.out.println("You have entered");
		{
			for (int i = 0; i < 10; i++) {
				System.out.println(z[i]);
			}
		}
	}
}
