package lab1;

import java.util.Scanner;

/*
 * Exercise 7: Create a method to check if a number is an increasing number
 * 
 * Note: Complete this exercise on Doselect.           [DoSelect-Lab1_3]
 * 
 * Method Name 			:	checkNumber 
 * Method Description 	:	Check if a number is an increasing number 
 * Argument 			:	int number 
 * Return Type 			:	boolean 
 * Logic 				:	A number is said to be an increasing number if no digit is exceeded by the digit to its left. 
 *							For Example : 134468 is an increasing number 
 */
public class Exercise7 {

	public static boolean checkNumber (int n) {
		boolean isIncrease = true;
		 /*
		 * A number is said to be an increasing number 
		 * if no digit is exceeded by the digit to its left. 
		 */
		
		String s = Integer.toString(n);
		char ch;
		for (int i=0; i<s.length()-1 ; i++) {
			ch = s.charAt(i);
			if (ch > s.charAt(i+1)){
				isIncrease = false;
				break;
			}
		}
		return isIncrease;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		if(checkNumber (n)) {
			System.out.println(n+" is an increasing number!!!  ");
		} else {
			System.out.println(n+" is NOT an increasing number!!!  ");
		}
		sc.close();
	}

}
