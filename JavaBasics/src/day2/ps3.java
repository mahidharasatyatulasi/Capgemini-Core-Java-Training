package day2;

import java.util.Scanner;

//printing even index elements
public class ps3 {

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
		System.out.println("Array elements in even indices :");  
		  
		for (int i=0; i<n; i++) {  
			if(i%2==0) 
			System.out.print(arr[i]+" ");  
		} 
		sc.close();
	}

}
