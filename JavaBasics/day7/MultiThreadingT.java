package day7;

import java.util.Scanner;

//Main Class
public class MultiThreadingT {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			MultithreadingDemo t = new MultithreadingDemo();
			t.start();
		}
		sc.close();
	}
}

// Extending the Thread class
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			System.out.println("Thread running is " +Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}



