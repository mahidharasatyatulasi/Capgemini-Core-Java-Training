package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array.
 *  Return the resulting array in descending order
 *  Method Name 	modifyArray 
 *  Method Description 	Remove duplicates 
 *  Argument 	int [] 
 *  Return Type 	int [] 
 *  Logic 	Remove the duplicate elements in the array and sort it in descending order  
 */

public class Exercise4 {
	public static int[] modifyArray(int[] arr) {
		int n=arr.length;
		if (n==0 || n==1){  
            return arr;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];      
        return temp;  
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
		System.out.println("Array after removing duplicates and sorting :");
		arr=modifyArray(arr);
		for(int i=0; i<n/2; i++) {
			 int j= arr[i];
			 arr[i] = arr[n-i-1];
			 arr[n-i-1] = j;
		}
		//System.out.println("Array after reversing:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}











//Collection<String> values = sourceMap.values();
//String[] targetArray = values.toArray(new String[0]);



/* way 1 : sort and hashmap or set can be used
way 2 : 	int n = arr.length;
			int j = 0;
			for (int i = 0; i < n-1; i++)
			    if (arr[i] != arr[i+1])
			        arr[j++] = arr[i];
			
			arr[j++] = arr[n-1];

return arr;
*/