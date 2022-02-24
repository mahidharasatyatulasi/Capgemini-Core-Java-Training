/*
 *  Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception) 
 *  in a package named as “com.cg.eis.exception” and 
 *  throw an exception if salary of an employee is below than 3000.
 *  Use Exception Handling mechanism to handle exception properly.
 */
package lab5;

import java.util.Scanner;
import com.cg.eis.exception.EmployeeException;

public class Exercise3 {
	public void validateSalary(long sal) throws EmployeeException {
		if(sal < 3000){
			throw new EmployeeException("Oops!Please enter a valid salary(>3000)!");
		}else {
			System.out.println("Thank you!");
		}
	   }
   
	    public static void main(String args[])
	    {
	    	Exercise3 obj = new Exercise3();
	        try {
	        	Scanner sc= new Scanner(System.in);
	        	System.out.println("Enter salary:");
	        	long sal = sc.nextLong();
	            obj.validateSalary(sal);
	            System.out.println("Salary : "+sal);
	            sc.close();
	        } catch (EmployeeException e) {
	            System.out.println("Caught the exception");
	            System.out.println(e.getMessage());
	        }
    }
}

