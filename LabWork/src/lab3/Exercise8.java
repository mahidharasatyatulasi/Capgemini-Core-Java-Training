package lab3;

import java.util.Scanner;

/*
 * Exercise 8: Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string, if on moving from left to right each character in the String 
 *  comes after the previous characters in the Alphabetical order. 
 *  For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 *  The method should return true if the entered string is positive.
 *  Note: Complete this exercise on Doselect.                     [DoSelect-Lab6_5]
 * 
 */
public class Exercise8 {
	public static boolean isPositive(String s) {
		 for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i) < s.charAt(i-1)) {
	                return false;
	            }
	        }
	      return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(isPositive(s))
			System.out.println(s+" is a Positive string ");
		else
			System.out.println(s+" is NOT a Positive string");
		sc.close();

	}

}
