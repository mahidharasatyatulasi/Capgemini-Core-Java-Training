/*
 * Exercise 4:  school offers medals to the students of tenth based on the following criteria 
 * If(Marks>=90) : Gold 
 * If(Marks between 80 and 90) : Silver 
 * If(Marks between 70 and 80) : Bronze 
 * Note: Marks between 80 and 90 means marks>=80 and marks<90 
 * Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
 * The input Hashmap contains the student registration number as key and mark as value. 
 * The output Hashmap should contain the student registration number as key and the medal type as value.
 * Method Name 			getStudents 
 * Method Description 	Generate the list of students eligible for scholarship 
 * Argument 			Hashmap 
 * Return Type 			Hashmap 
 * Logic 				The method should return the details of the students eligible for the medals along with the medal type. 
 */
package lab6;

import java.util.HashMap;
import java.util.Map.Entry;

public class Exercise4 {
	
	public static HashMap<String,String> getStudents(HashMap<String,Integer> mp) {
	       HashMap<String,String> medalmp = new HashMap<String,String>();
	       for(Entry<String, Integer> e: mp.entrySet()) {
	              int marks = e.getValue();
	              if(marks>=90) {
	            	  medalmp.put(e.getKey(),"Gold");
	              }else if(marks >=80) {
	            	  medalmp.put(e.getKey(),"Silver");
	              }else if(marks>=70) {
	            	  medalmp.put(e.getKey(),"Bronze");
	              }
	       }
	       return medalmp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> s = new HashMap<>();
	       s.put("R001",90);
	       s.put("R002",76);
	       s.put("R003",89);
	       s.put("R004",90);
	       s.put("R005",93);
	       System.out.println(getStudents(s));
	}

}
