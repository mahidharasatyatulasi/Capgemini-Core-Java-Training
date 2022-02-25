package day7;

import java.util.Scanner;

//Main class
public class MultiThreadingR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			 Thread th = new Thread(new MultiThreading());
			 th.start();
		}
		sc.close();
	}
}
//Implementing the Runnable Interface
class MultiThreading implements Runnable {
	public void run()
	{
		try {
			System.out.println("Thread running :" + Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

}


