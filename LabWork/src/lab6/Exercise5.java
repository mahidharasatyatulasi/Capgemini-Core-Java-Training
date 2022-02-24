/*
 * Exercise 5: Create a method which accepts an array of integer elements and return the second smallest element in the array

Method Name 			getSecondSmallest 
Method Description 		Get the second smallest element in the array 
Argument 				int[] 
Return Type 			int 
Logic 					Sort the array and return the second smallest element in the array 
Hint: 
1. Convert to Array List 
2. Use sort method in Collections class 


 */
package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	public static int getSecondSmallest(int[] arr) {  
		Integer[] a = new Integer[arr.length];
		Arrays.setAll(a, i->arr[i]);//int[] to Integer[]
		List<Integer> l=Arrays.asList(a);  
		Collections.sort(l);  
		return l.get(1);  
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
			System.out.println("Second Smallest element : "+getSecondSmallest(arr));
			sc.close();	
	}

}
