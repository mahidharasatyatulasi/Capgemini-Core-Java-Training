/*
 *  Exercise 3: Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
 * Method Name			getSquares
 * Method Description	Accepts a list of numbers and return their squares
 * Argument				int[]
 * Return Type			Map
 * Logic				Iterate through the list, find the square of each
 * number and add the elements to a map object
 * with the number as the key and the square as the value

 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab7_3]
*/
package lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise3 {

		public static HashMap<Integer, Integer> getSquares(int[] a) {
		    HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		    for (int n:a) {
		      mp.put(n,n*n);
		    }
		    return mp;
		  }
	 
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter array size: ");
			int n = sc.nextInt();
			int arr[] =  new int[n];
			
			System.out.println("Enter array elements: ");
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
	    
		    HashMap<Integer, Integer> mp = getSquares(arr);
		    Iterator<Integer> it = mp.keySet().iterator();
		    while(it.hasNext()) {
		    	Integer key = it.next();
		      System.out.println(key + " : " + mp.get(key));
		    }
		    sc.close();
	  }

}
