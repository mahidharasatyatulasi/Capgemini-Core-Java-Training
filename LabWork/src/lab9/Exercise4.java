package lab9;

import java.util.Scanner;

/*
 * Exercise 4: Write a class with main method to demonstrate instance creation using method reference.
 *  (Hint: Create any simple class with attributes and getters and setters)
 */
@FunctionalInterface
interface Employee {
	String getName();
}
public class Exercise4 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Exercise4 obj=new Exercise4();
		
		System.out.println("Enter employee name:");
		obj.setName(sc.nextLine());
		
		Employee emp=obj::getName;
		System.out.println("Emp name: "+emp.getName());
		sc.close();
	}
}
