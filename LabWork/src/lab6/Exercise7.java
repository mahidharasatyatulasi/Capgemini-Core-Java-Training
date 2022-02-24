/*
 *  

Exercise 7: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

Method Name 		getSorted 
Method Description 	Return the resulting array after reversing the numbers and sorting it 
Argument 			int[] 
Return Type 		int 
Logic 				Accept and integer array, reverse the numbers in the array, sort it and return the resulting array. 
Hint 
1. Convert the numbers to String to reverse it 
2. Use Collection APIs to sort it 



 * 
 */
package lab6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise7 {
	public static Integer[] getSorted(TreeSet<Integer> a)
	{
		int n = a.size();
		Integer arr[] = new Integer[n];
		arr = a.toArray(arr);
		
		for(int i=0; i<n ; i++) {
			String val = String.valueOf(arr[i]);
			String rev = new StringBuilder(val).reverse().toString();
			arr[i] = Integer.parseInt(rev);
		}
		
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		
		TreeSet<Integer> a = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int e = sc.nextInt();
			a.add(e);
		}
		Integer res[] = getSorted(a);
		System.out.println("Array after Revrsing the number and Soretd are as follows: ");
		for(int i: res) {
			System.out.print(i + "  ");
		}
		sc.close();
	}
}











































/*
public class Exercise7 {
	public static int rev(int n) {
		StringBuffer sb = new StringBuffer(n);
        sb.reverse();
        return Integer.parseInt(sb.toString());
	}
	public static int[] getSorted(int[] a) {
		for(int i=0; i<a.length; i++) {
			a[i]=rev(a[i]);
		}
		return Arrays.sort(a);
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
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
*/