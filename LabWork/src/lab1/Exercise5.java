package lab1;

import java.util.Scanner;

/*
 * Exercise 5: Create a class with a method which can calculate 
 * the sum of first n natural numbers which are divisible by 3 or 5.
 * 
 * Note: Complete this exercise on Doselect.          [DoSelect-Lab1_1]
 * 
 * Method Name 	calculateSum 
 * Method Description 	:	Calculate Sum 
 * Argument 			:	int n 
 * Return Type 			:	int-sum 
 * Logic 				:	Calculate the sum of first n natural numbers which are divisible by 3 or 5. 
 * 
 */
public class Exercise5 {
	public static int calculateSum(int n) {
		int sum = 0;
		for( int i=1; i<=n; i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Sum of n natural nos divisible by 3 or 5: "+calculateSum(n));
		sc.close();
	}

}
