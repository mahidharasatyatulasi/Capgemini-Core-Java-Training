package lab1;

/*
 * Exercise 8: Create a method to check if a number is a power of two or not
 * 
 * 
 * Note: Complete this exercise on Doselect.           [DoSelect-Lab1_3]
 * 
 * Method Name 			:	checkNumber 
 * Method Description 	:	Checks if the entered number is a power of two or not 
 * Argument 			:	int n 
 * Return Type 			:	boolean 
 * Logic 				:	Check if the input is a power of two. 
 * 							Ex: 8 is a power of 2 
 */
import java.util.Scanner;

public class Exercise8 {

	public static boolean checkNumber (int n) {
		boolean isPower = true;
		// isPower =  n!=0 && ((n&(n-1)) == 0);
	    if (n==0)
            isPower = false;
        while (n!=1) {
            if (n%2!=0)
            	isPower = false;
            n=n/2;
        }
		return isPower;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		if(checkNumber (n)) {
			System.out.println(n+" is a power of 2!!!  ");
		} else {
			System.out.println(n+" is NOT a power of 2!!!  ");
		}
		sc.close();
	}

}
