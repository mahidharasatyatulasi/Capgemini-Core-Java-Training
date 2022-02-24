package lab1;

/*
 * Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 */
import java.util.Scanner;

public class Exercise4 {

	public static boolean isPrime(int n)
	{
	    // Corner cases
	    if (n <= 1)
	        return false;
	    if (n <= 3)
	        return true;
	 
	    if (n % 2 == 0 || n % 3 == 0)
	        return false;
	 
	    for (int i = 5; i * i <= n; i = i + 6)
	        if (n % i == 0 || n % (i + 2) == 0)
	            return false;
	    return true;
	}
	 
	// Function to print primes
	public static void primeSeries(int n)
	{
	    for (int i = 2; i <= n; i++)
	    {
	        if (isPrime(i))
	            System.out.print(i + " ");
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		primeSeries(n);
		sc.close();
	}

}
