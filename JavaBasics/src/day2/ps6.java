package day2;

import java.util.Scanner;

//find the min and max values of an array.
public class ps6 {
	public static int max(int [] arr,int n) {
	      int max = 0;
	     
	      for(int i=0; i<n; i++ ) {
	         if(arr[i]>max) {
	            max = arr[i];
	         }
	      }
	      return max;
	   }
	public static int min(int [] arr,int n) {
	      int min = arr[0];
	     
	      for(int i=0; i<n; i++ ) {
	         if(arr[i]<min) {
	            min = arr[i];
	         }
	      }
	      return min;
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
		System.out.println("Minimum of array elements :"+min(arr,n)); 
		System.out.println("Maximum of array elements :"+max(arr,n)); 
		sc.close();
	}

}
