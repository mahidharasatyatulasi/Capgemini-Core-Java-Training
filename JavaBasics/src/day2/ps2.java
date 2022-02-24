package day2;
// sorting based on descending order
import java.util.*;

public class ps2 {

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
		System.out.println("Array elements in descending order using Arrays.sort method: ");
		//Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		int temp;
		for (int i=0; i<n; i++) {  
			for (int j=i+1; j<n; j++) {  
				if (arr[i] < arr[j]) {  
					temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
				}  
		     }  
		}  
		System.out.println("Array elements in descending order:");  
  
		for (int i=0; i<n; i++) {  
			System.out.print(arr[i]+" ");  
		}  
		sc.close();
	}

}
