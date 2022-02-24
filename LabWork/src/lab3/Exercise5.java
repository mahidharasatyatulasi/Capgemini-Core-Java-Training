package lab3;

import java.util.Scanner;

/*
 * Exercise 5: Write a Java program that displays the number of characters, lines and words in a text? 
 *
 *  https://www.knowprogram.com/c-programming/c-program-to-count-lines-words-and-characters-in-a-given-text/
 *
 */
public class Exercise5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		
		int characters=0,words=0,newline=0;
		for(int i=0;ch[i]!='\0';i++)
	     { 
	         if(ch[i] == ' ')
	         { 
	              words++;
	         }
	         else if(ch[i] == '\n')
	         {
	             newline++;
	              words++;//since with every next line new words start. corner case 1
	         }
	         else if(ch[i] != ' ' && ch[i] != '\n'){
	         characters++;
	         }
	     }
	    if(characters > 0)//Corner cases
	    {
	        words++;
	        newline++;
	    }
		
		System.out.println("No of characters : "+characters);//charCount(s));
		System.out.println("No of lines : "+newline);//lineCount(s));
		System.out.println("No of words : "+words);//wordCount(s));
		sc.close();
		
	}

}

























/*public static int lineCount(String str) {
if(str == null || str.isEmpty())
{
    return 0;
}
int lines = 1;
int pos = 0;
while ((pos = str.indexOf("\n", pos) + 1) != 0) {
    lines++;
}
return lines;
}

public static int wordCount(String str) {
int words = 0;
if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
{
    for (int i = 0; i < str.length(); i++)
    {
        if (str.charAt(i) == ' ')
        {
        	words++;
        }
    }
    words += 1; 
}
return words; // returns 0 if string starts or ends with space " ".
}

public static int charCount(String str) {
int chars = 0;
for(int i = 0; i < str.length(); i++) {    
    if(str.charAt(i) != ' ')    
        chars++;    
}    
return chars;
}
*/

