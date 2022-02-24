package lab1;

import java.util.Scanner;

/*
 * Create a class with a method to find the difference between the sum of the squares 
 * and the square of the sum of the first n natural numbers.
 * 
 * Note: Complete this exercise on Doselect.           [DoSelect-Lab1_2]
 * 
 * Method Name 			:	calculateDifference 
 * Method Description 	:	Calculate the difference 
 * Argument 			:	int n 
 * Return Type 			:	int - Sum 
 * Logic 				:	Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
 * 							For Example if n is 10,you have to find (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2 
 * 
 */
public class Exercise6 {

		public static int calculateDifference(int n) {
			int diff = 0,sum = 0,sqsum = 0;
			sqsum = (n*(n+1)*(2*n+1)) / 6;
		    sum = (n * (n + 1)) / 2;
		    sum =sum*sum;
		    diff = Math.abs(sqsum - sum);
			return diff;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n: ");
			int n = sc.nextInt();
			System.out.println("Difference between the sum of the squares of the first n natural numbers and the square of their sum :  "+calculateDifference(n));
			sc.close();
		}
}
