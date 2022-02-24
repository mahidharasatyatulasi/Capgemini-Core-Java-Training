package lab9;

import java.util.Scanner;

/*
 * 
Exercise 3: Write a method that uses lambda expression to accept username and password and return true or false. 
(Hint: Use any custom values for username and password for authentication)

 */
@FunctionalInterface
interface UserValidation {
	Boolean validate(String username,String password);
}
public class Exercise3 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		UserValidation obj=(username,password)->{
			if(username.equals("admin") &&
					password.equals("a123")) {
				return true;
			}
			return false;
		};

		System.out.println("Enter username and password:");
		String uname=sc.nextLine();
		String pass=sc.nextLine();
		System.out.println(obj.validate(uname, pass));
		sc.close();
	}
}
