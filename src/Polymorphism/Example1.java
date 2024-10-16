package Polymorphism;

public class Example1 {
 void sum(int d,int e)
 {
	 System.out.println("Sum is : "+(d+e));
 }
 
 void sum(double a,double b)
 {
	 System.out.println("Sum is : "+(a+b));
 }
 
 public static void main(String[] args) {
	Example1 e1 = new Example1();
	e1.sum(12, 23);
	e1.sum(12.3, 56.3);
}
}
