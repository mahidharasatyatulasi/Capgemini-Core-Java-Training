package lab9;

import java.util.Scanner;

/*
 * Exercise 2: Write a method that uses lambda expression to format a given string,
 *  where a space is inserted between each character of string. 
 *   For ex., if input is “CG”, then expected output is “C G”.

 */
@FunctionalInterface
interface StringInterface {
	public abstract String spaceStr(String str);
}
public class Exercise2 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StringInterface strObj=(str)->{
			String str2="";
			for(int i=0;i<str.length();i++) {
				str2+=str.charAt(i)+" ";
			}
			return str2;
		};

		System.out.println("Enter string:");
		String s=sc.nextLine();
		System.out.println("String after spaces is:"+strObj.spaceStr(s));
		sc.close();
	}
}
