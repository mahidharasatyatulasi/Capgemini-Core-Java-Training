package lab5;

import java.util.Scanner;

/*
 * Exercise 1:  Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.
 * Note: Complete this exercise on Doselect.   Doselect Age Exception
 * 
 */


public class Exercise1 {
	public static void validate (int age) throws InvalidAgeException{    
	       if(age < 15){  
	        throw new InvalidAgeException("Please enter a valid age (must be more than 15)!");    
	       }  else {   
	        System.out.println("Thanks for entering your age!!!");   
	        }   
	     }    		
	public static void main(String[] args) {
		//try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age:");
			int age = sc.nextInt();
			validate(age);
			System.out.println("Age entered is "+age);
		    sc.close();
		//} catch (Exception e){
		//	e.getMessage();
		//	}
	}

}
