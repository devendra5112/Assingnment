package Polymorphism;

public class Example2 {
 void A(int a,int b)
 {
	 System.out.println("Area is : "+(a*b));
 }
 
 void A(int a,int b,int c)
 {
	 System.out.println("Area is : "+(a*b*c));
 }
 public static void main(String[] args) {
	Example2  e2 = new Example2();
	e2.A(8, 5);
	e2.A(4, 6, 2);
}
}
