package lab9;
/*
 * Exercise 1: Write a lambda expression which accepts x and y numbers and return xy.

 */

import java.util.Scanner;

@FunctionalInterface
interface Power {
	public abstract double power(int x, int y);
}
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Power powerObj=(x,y)->{
			return Math.pow(x, y);
		};
		
		System.out.println("Enter two numbers:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Power of "+x1+ " raised to "+y1 +" is: "+ powerObj.power(x1,y1));
		sc.close();
	}
}
