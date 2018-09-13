package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * Lab 3
 * @author kavyakumar
 *
 *	3.4: Revise exercise 3.3 to accept two LocalDates 
 * and print the duration between dates in days, months and years.
 */
public class DatesDuration {

	static void printDuration(int d1, int m1, int y1,int d2, int m2, int y2 ) {
		
		LocalDate inputDate1 = LocalDate.of(y1, m1, d1);
		LocalDate inputDate2 = LocalDate.of(y2, m2, d2);
		
		Period d = Period.between(inputDate1, inputDate2);

		System.out.format("The duration between the two input dates is %d years, %d months and %d days,",d.getYears(),d.getMonths(),d.getDays());
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first date in the format: yyyy-mm-dd");
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split("-",3);
		
		System.out.println("Enter the second date in the format: yyyy-mm-dd");
		Scanner sc1 = new Scanner(System.in);
		
		String[] input1 = sc1.nextLine().split("-",3);
		
		
		int y1 = Integer.parseInt(input[0]);
		int y2 = Integer.parseInt(input1[0]);
		
		int m1 = Integer.parseInt(input[1]);
		int m2 = Integer.parseInt(input1[1]);
		
		int d1 = Integer.parseInt(input[2]);
		int d2 = Integer.parseInt(input1[2]);
		
		printDuration(d1,m1,y1,d2,m2,y2);

	}

}
