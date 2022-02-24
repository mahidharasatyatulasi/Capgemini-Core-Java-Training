
package lab1;

/*
 * Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
 */

import java.util.Scanner;

public class Exercise1 {
	
	public static int cubeSum(int n, int dig) {
		int sum = 0;
		int temp;
		while(n>0) {
			temp = n%10;	
			n = n/10;	
			sum += temp*temp*temp;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of digits: ");
			int digits = sc.nextInt();
			System.out.println("Enter no: ");
			int no = sc.nextInt();
			System.out.print(cubeSum(no,digits));
			sc.close();
	}

}
