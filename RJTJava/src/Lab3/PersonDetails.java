package Lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import Lab2.Person;

/**
 * Lab 3
 * @author kavyakumar
 *
 *	3.7: Modify Lab assignment 2.3 to perform following functionalities:
		a) Add a method called calculateAge which should accept person’s date of birth and
			calculate age of a person.
		b) Add a method called getFullName(String firstName, String lastName) which should
			return full name of a person
		Display person details with age and fullname.
		
 */
public class PersonDetails {

	private static Person person;

	public static void calculateAge(int d, int m, int y) {
		
		LocalDate birthDate = LocalDate.of(y, m, d);
		LocalDate currDate = LocalDate.now();
		
		Period p = Period.between(birthDate, currDate);
		
		System.out.format("Age: %d years, %d months, %d days", p.getYears(),p.getMonths(),p.getDays());

		return;
	}
	
	public static String getFullName(String firstName, String lastName) {
		
		String fullname = firstName + " " + lastName;
		
		return fullname;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter first name");
		Scanner scan = new Scanner(System.in);
		String fname = scan.nextLine();
		
		System.out.println("Enter last name");
		String lname = scan.nextLine();
			
		System.out.println("Please enter your birthday in the format: yyyy-mm-dd");
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split("-",3);
		
		int y = Integer.parseInt(input[0]);
		
		int m = Integer.parseInt(input[1]);
		
		int d = Integer.parseInt(input[2]);
		
		person = null;
		
		System.out.println("Full Name: " + getFullName(fname, lname));
		person.setFirstName(fname);
		person.setLastName(lname);
		person.personDetails();
		
		calculateAge(d,m,y);
		
		
	}

}
