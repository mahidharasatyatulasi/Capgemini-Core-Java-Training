/*
 * 
 * Exercise 6: Create a method which accepts the id and the age of people as a Map and 
 * decide if they are eligible for vote. A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list. 
 * 
 * Method Name 			votersList 
 * Method Description 	Generate the list of voters based on the ages of the people 
 * Argument 			Map 
 * Return Type 			List 
 * Logic 				Accept a map with ID as key and Date of Birth as value and check if the person is eligible to vote. A person is eligible for vote for if his age is greater than 18. If the person is eligible add his ID to the list.
 */
package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {
	public static List<Integer> votersList (Map<Integer,Integer> mp) {
		List<Integer> l = new ArrayList<Integer>();
		for (int i : mp.keySet()) {  
			if(mp.get(i)>=18) {
				l.add(i);
			}
        } 
		return l;	
	}
	public static void main(String[] args) 
	{
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		mp.put(11,15);
		mp.put(56,25);
		mp.put(13,18);
		mp.put(1,17);
		List<Integer> l = new ArrayList<Integer>(votersList(mp));
		for(int i : l) {
			System.out.println(i);	
		}

	}
}
