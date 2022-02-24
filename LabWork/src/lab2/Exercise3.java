package lab2;
/*
 * Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 * 
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_3]
 * 
 * Method Name 			:	getSorted 
 * Method Description 	:	Return the resulting array after reversing the numbers and sorting it 
 * Argument 	        :	int [] 
 * Return Type 			:	int 
 * Logic 				:	Accept and integer array, reverse the numbers in the array, sort it and return the resulting array.
 * Hint  				:	Convert the numbers to String to reverse it 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static int[] getSorted(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n/2; i++) {
			 int j= arr[i];
			 arr[i] = arr[n-i-1];
			 arr[n-i-1] = j;
		}
		System.out.println("Array after reversing:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		int arr[] =  new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		getSorted(arr);
		System.out.println("Array after reversing and sorting :");
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}






