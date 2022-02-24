package lab2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_1]
 * 
 * Method Name 			:	getSecondSmallest 
 * Method Description	: 	Get the second smallest element in the array 
 * Argument 			:	int[] 
 * Return Type 			:	int 
 * Logic 				:	Sort the array and return the second smallest element in the array 
 * 
 */
public class Exercise1 {

	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
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
		System.out.println("The second smallest element in the array : "+ getSecondSmallest(arr));
		
		sc.close();
	}

}
