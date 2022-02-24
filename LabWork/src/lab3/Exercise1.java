package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Exercise 1: Write a Java program that reads a line of integers and 
 * then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab6_1]
 * 
 */
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nuumbers in a line : ");
        String digit=sc.nextLine();
        StringTokenizer token=new StringTokenizer(digit);
        int dig=0,sum=0;
        System.out.println("\nEntered digits are : ");
        while(token.hasMoreTokens()) {
            String s=token.nextToken();
            dig=Integer.parseInt(s);
            System.out.print(dig+" ");
            sum=sum+dig;
        }
        System.out.println();
		System.out.println("Sum is : "+sum);
		sc.close();
	}

}
