package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Lab 3
 * @author kavyakumar
 *
 *	3.3: Create a method to accept date 
 *	and print the duration in days, months and 
 *	years with regards to current system date.
 *
 */
public class DateDuration {

	static void printDuration(int day, int month, int year) {
		
		LocalDate inputDate = LocalDate.of(year, month, day);
		LocalDate currentDate = LocalDate.now();
		
		Period d = Period.between(inputDate, currentDate);
		
		System.out.format("The duration of the input date with regard to current system"
				+ "date is %d days, %d months and %d years", d.getDays(), d.getMonths(), d.getYears());
		
		
		
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the date year");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println("Enter the date month");
		int month = sc.nextInt();
		
		System.out.println("Enter the day of the month");
		int day = sc.nextInt();
		
		printDuration(day, month, year);
		
		
	}

}
