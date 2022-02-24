package lab2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order.
 *  The elements in the left half should be completely in uppercase 
 *  and the elements in the right half should be completely in lower case. Return the resulting array.
 *  Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
 *  
 *  Note: Complete this exercise on Doselect.        [DoSelect-Lab3_2]
 *  Method Name 	    :   sortStrings
 *  Method Description  : 	accept an array of String objects and sort in Alphabetical order.
 *  Argument 	        :	String[] arr
 *  Return Type 		:	String 
 */
public class Exercise2 {

	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int n=arr.length;
		if(n%2==0) { //even no of elements
			for(int i=0;i<n/2;i++)
				arr[i]=arr[i].toUpperCase();
			for(int i=n/2;i<n;i++)
				arr[i]=arr[i].toLowerCase();
		} else { //odd no of elements
			for(int i=0;i<n/2+1;i++)
				arr[i]=arr[i].toUpperCase();
			for(int i=n/2+1;i<n;i++)
				arr[i]=arr[i].toLowerCase();
		}
			
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n = sc.nextInt();
		String arr[] =  new String[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		System.out.println(" array : ");
		sortStrings(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}

}
