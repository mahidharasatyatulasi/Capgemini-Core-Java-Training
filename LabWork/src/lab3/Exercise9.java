package lab3;

import java.time.LocalDate;
import java.time.Period;

/*
 * Exercise 9: Create a method to accept date and print the duration in days, months and years with regards to current system date.
 */
public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate pdate = LocalDate.of(2021, 01, 01);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
        System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
