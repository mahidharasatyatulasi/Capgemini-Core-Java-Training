package lab1;

/*  Exercise 2: Write a java program that simulates a traffic light. 
 *  The program lets the user select one of three lights: red, yellow, or green with radio buttons.
 *  On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
 *  Initially there is no message shown.
 * 
 */
import java.util.Scanner;

public class Exercise2 {

	public static void show(String light) {
		switch(light) {
				case "red": System.out.println("stop");
		            		break;
				case "yellow": System.out.println("ready");
        					break;
				case "green": System.out.println("go");
        					break;
        		default : System.out.println(".");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a light red/yellow/green : ");
		String light = sc.nextLine();
		show(light);
		sc.close();
	}

}
