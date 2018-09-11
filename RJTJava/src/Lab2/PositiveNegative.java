package Lab2;
import java.util.Scanner;

/**
 * Lab 2
 * @author kavyakumar
 *
 *	2.2: Write a program to accept a number 
 *	from user as a command line argument and check whether the given 
 *	number is positive or negative number.
 *
 */
public class PositiveNegative {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a number");
		
		sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if (input >= 0)
			System.out.println("Given number is positive");
		else
			System.out.println("Given number is negative");
	
	}

}
