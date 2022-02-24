package lab9;

import java.util.Scanner;

/*
 * 

Exercise 5: Write a method to calculate factorial of a number. Test this method using method reference feature. 

 */
@FunctionalInterface
interface Factorial {
	Integer findFacto(int num);
}
public class Exercise5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Factorial obj=(no)->{
     	int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	};
	
	System.out.println("Enter num to find factorial:");
	int num=sc.nextInt();
	System.out.println(obj.findFacto(num));
	sc.close();
}
}
