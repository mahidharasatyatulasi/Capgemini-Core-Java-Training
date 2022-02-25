package day9;

import java.util.ArrayList;
import java.util.Collections;

@FunctionalInterface
interface StrConcat{
	public String concat(String x, String y);
}

@FunctionalInterface
interface SquareNumber{
	public void square(int n);
}

@FunctionalInterface
interface OddCount{
	public int getOddCount(ArrayList<Integer> l);
}

public class Lambda {
	public static void main(String[] args) {
		// write lambda expression to square the given number
		StrConcat sc = (x, y) -> x + y;
		System.out.println(sc.concat("Hello ","World !"));

		// write lambda expression to concatenate strings
		SquareNumber s = n -> System.out.println("Square of the number is: "+ n*n);
		s.square(50);

		
		// Iterate collections using forEach loop
		// hint: ArrayList<Integer> al = new ArrayList<>();
		// al.forEach(//lambda expr to print arraylist elements);
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(70);
		l.add(40);
		l.add(80);
		l.add(35);
		l.add(35);
		l.add(80);
		
		System.out.print("List : ");
		l.forEach(element -> System.out.print(element+" "));
		System.out.println();
		
		//return values greater than 50
		System.out.print("Greater than 50 : ");
		l.forEach(element -> { if(element>50) {
			System.out.print(element+" ");
		}});
		System.out.println();

		//return even numbers
		System.out.print("Even : ");
		l.forEach(element -> { if(element%2==0) {
			System.out.print(element+" ");
		}});
		System.out.println();
		
		//get odd numbers count
		System.out.print("Odd count : ");
		OddCount o = (ArrayList<Integer> list)->
		{
			int oc = 0;
			for(int n : l) {
				if(n%2!=0) 
					oc++;
			}
			return oc;
		};
		System.out.println(o.getOddCount(l));		
		
		///Sort in ascending order
		System.out.print("After sorting : ");
		Collections.sort(l , (o1,o2) -> (o1 < o2) ? -1: (o1 > o2) ? 1: 0);
		System.out.println(l);
		
		//find min & max values
		
		//min value
		int minimum = Integer.MAX_VALUE;
		for(int n : l) {
			minimum = (n < minimum) ? n : minimum;
		}
		System.out.println("Minimum : "+minimum);
		
		//max value
		int maximum = Integer.MIN_VALUE;
		for(int n : l) {
			maximum = (n > maximum) ? n : maximum;
		}
		System.out.println("Maximum : "+maximum);
	}
}
