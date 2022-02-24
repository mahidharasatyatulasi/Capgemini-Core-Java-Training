package lab5;
/*
 * Exercise 2: Write a Java Program to validate the full name of an employee.
 * Create and throw a user defined exception if firstName and lastName is blank.
 * Note: Complete this exercise on Doselect.       Doselect Name Exception
 */

import java.util.Scanner;

public class Exercise2 {
	   public void validateName(String fn,String ln) throws InvalidNameException {
		if(fn.equals(" ") || ln.equals(" ")){
			throw new InvalidNameException("Oops!Please enter a valid name!");
		}
	   }
   
	    public static void main(String args[])
	    {
	    	Exercise2 obj = new Exercise2();
	        try {
	        	Scanner sc= new Scanner(System.in);
	        	System.out.println("Enter first name:");
	        	String fn = sc.nextLine();
	        	System.out.println("Enter last name:");
	        	String ln = sc.nextLine();
	            obj.validateName(fn,ln);
	            System.out.println("Name : "+fn+" "+ln);
	            sc.close();
	        } catch (InvalidNameException e) {
	            System.out.println("Caught the exception");
	            System.out.println(e.getMessage());
	        }
         }
}