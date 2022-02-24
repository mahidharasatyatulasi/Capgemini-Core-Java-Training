/*
 * Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 * Method Name 			getValues 
 * Method Description 	Get the values of a map in sorted order 
 * Argument 			HashMap 
 * Return Type 			List 
 * Logic 				Return the values of a hash map in sorted order 
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab7_1 ]
 */
package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
	public static ArrayList<Integer> getValues(HashMap<String, Integer> mp) {
		ArrayList<Integer> a = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
		    a.add(entry.getValue());
		}
		Collections.sort(a);
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> mp = new HashMap<>();
		mp.put("A", 9);
		mp.put("B", 8);
		mp.put("C", 7);
		mp.put("D", 6);
		mp.put("E", 5);
		mp.put("F", 4);
		mp.put("G", 3);
		System.out.println(getValues(mp));
	}
}


