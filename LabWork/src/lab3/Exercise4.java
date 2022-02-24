package lab3;

import java.util.Scanner;

/*
 * Exercise 4: Create a method that accepts a number and modifies it such that 
 * the each of the digit in the newly formed number is equal to the difference 
 * between two consecutive digits in the original number. The digit in the units place can be left as it is. 
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2
 * Method Name 			modifyNumber 
 * Method Description 	Accepts a number and modify it as per the requirement 
 * Argument 			int number1 
 * Return Type 			int 
 * Logic 				Accept a number and modify it such that the each of the digit in the newly formed number
 * 						is equal to the difference between two consecutive digits in the original number. 
 * For example. 
 * Input: 45862 
 * Output:13242 
 * Algorithm: 
	• Convert number into String 
	• Extract each char using charAt method 
	• Convert char to int and find the difference 
	• Create new StringBuffer object and keep adding the difference 
	• Finally convert StringBuffer to int 
 * 
 */
public class Exercise4 {
	
	public static int modifyNumber(int n) {
		String s = Integer.toString(n);
		char[] c = s.toCharArray();
	    int[] a = new int[c.length];

	    for (int i = 0; i < c.length; i++){
	        a[i] = c[i] - '0';
	    }
	    StringBuffer sb = new StringBuffer();
	    for (int i = 1; i < c.length; i++){
	    	sb.append(Math.abs(a[i-1]-a[i]));
	    }
	    sb.append(a[c.length-1]);
	    String no=sb.toString();
	    int mn = Integer.parseInt(no);
		return mn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(modifyNumber(n));
		sc.close();

	}

	

}
