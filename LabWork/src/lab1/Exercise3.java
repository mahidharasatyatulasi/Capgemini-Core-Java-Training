package lab1;

/*
 * Exercise 3: The Fibonacci sequence is defined by the following rule.
 *  The first 2 values in the sequence are 1, 1.
 *  Every subsequent value is the sum of the 2 values preceding it.
 *  Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 * 
 */

import java.util.Scanner;

public class Exercise3 {

	public static int recursiveFibonacci(int n) {
	    if (n <= 1)
	       return n;
	    return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
	
	public static int nonRecursiveFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth value: ");
		int n = sc.nextInt();
		System.out.println("Recursive Fibonacci nth value: ");
		System.out.println(recursiveFibonacci(n));
		
		System.out.println("Non Recursive Fibonacci nth value: ");
		System.out.println(nonRecursiveFibonacci(n));
		sc.close();
	}

}
