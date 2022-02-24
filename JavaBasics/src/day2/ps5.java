package day2;

import java.util.Scanner;

//find the sum of all elements in an array
public class ps5 {

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
		
		int sum = 0;  
		for (int i=0; i<n; i++) {  
			sum += arr[i];  
		} 
		System.out.println("Sum of array elements :"+sum); 
		sc.close();
	}

}
