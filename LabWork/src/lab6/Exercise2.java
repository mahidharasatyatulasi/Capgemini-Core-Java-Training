/*
 *  Exercise2 Collection: Create a method that accepts a character array and count the number of times each character is present in the array.
 * 
 * Note: Complete this exercise on Doselect.                     [DoSelect-Lab3_4]

 * Method Name 	countChars
 * Method Description 	method that accepts a character array and count the number of times each character is present in the array.
 * Argument 	char[] arr
 * Return Type 	Map<Character, Integer>
 * Logic 
 */
package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	public static HashMap<Character, Integer> charCount(char[] arr)
    {
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
        for (char c : arr) {
            if (counter.containsKey(c)) {
            	counter.put(c,counter.get(c)+1);
            }
            else {
            	counter.put(c,1);
            }
        }
        return counter;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "capgemini";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> ans = charCount(arr);
		for (Map.Entry entry : ans.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

}


