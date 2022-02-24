package pkg2;

import pkg1.Employee;
import pkg1.JavaBasics;

import pkg1.Student;

public class Test {
     public static void main(String[] args) {
    	
    	 Employee employee1 = new Employee();
    	 Employee employee2 = new Employee();
    	 
    	 JavaBasics javaBasics = new JavaBasics();
    	 
    	 System.out.println(javaBasics.skills);//null
  	     System.out.println(employee1.name);//null
  	   	   	
  	   	 employee1.name="Tulasi";
    	 employee1.age=21;
    	 employee1.dept="CSE";
    	 
    	 System.out.println(employee1.name);
    	 System.out.println(employee1.age);
    	 System.out.println(employee1.dept);
    	 
    	 employee2.name="Sai";
    	 employee2.age=23;
    	 employee2.dept="ECE";
    	 
    	 System.out.println(employee2.name);
    	 System.out.println(employee2.age);
    	 System.out.println(employee2.dept);
    	
    	 
    	 Student s1 = new Student();
    	 Student s2 = new Student();
  	   	 //JavaBasics javaBasics = new JavaBasics();

  	   	 //System.out.println(javaBasics.skills);//null
  	   	 System.out.println(s1.name);//null
  	   	 
    	 s1.name="Tulasi";
    	 s1.age=21;
    	 s1.dept="CSE";
    	 
    	 System.out.println(s1.name);
    	 System.out.println(s1.age);
    	 System.out.println(s1.dept);
    	 
    	 s2.name="Sai";
    	 s2.age=23;
    	 s2.dept="ECE";
    	 
    	 System.out.println(s2.name);
    	 System.out.println(s2.age);
    	 System.out.println(s2.dept);
    	 
    	 //System.out.println();
     }
}
