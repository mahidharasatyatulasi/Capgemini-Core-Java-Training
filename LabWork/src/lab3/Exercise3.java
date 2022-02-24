package lab3;

import java.util.Scanner;

/*
 *  Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
	Note: Consonant refers to all alphabets excluding vowels
	
	Method Name 	alterString 
	Method Description 	Replace consonants 
	Argument 	String 
	Return Type 	String 
	Logic 	Return the String replacing all the consonants with the next character. 
	For Example :JAVA should be changed as KAWA 

 */
public class Exercise3 {
	public static String replaceConsonants(String str)
    {
           StringBuffer sbr = new StringBuffer(str);
           for(int i=0;i<str.length();i++)
           {
                  char c = sbr.charAt(i);
                  if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
                  {
                        sbr.replace(i,i+1,String.valueOf((char)(c+1)));
                  }
           }
           return sbr.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a string");
	       String str = sc.next();
	       System.out.println(replaceConsonants(str));
	       sc.close();
    }
	

}
