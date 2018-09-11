package Lab3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * Lab 3
 * @author kavyakumar
 *
 *	3.1: Create a method which can perform a particular String operation based on the user’s choice. The method should accept the String object and the user’s choice and return the output of the operation.
	Options are
		 Add the String to itself
		 Replace odd positions with #
		 Remove duplicate characters in the String 
		 Change odd characters to upper case
		
 */
public class StringOperation {

	private static String str = "";
	private static int choice;
	
	StringOperation() {};
	
	StringOperation (String str, int choice) {
		this.str = str;
		this.choice = choice;
	}
	private static void options() {
		
		if (choice < 1 || choice > 4)
			return;
		
		if (choice == 1) {
			
			str += str;
		} else if (choice == 2) {
			
			str = choice2();
			
		} else if (choice == 3) {
			
			str = choice3();
			
		} else if (choice == 4) {
			str = choice4();
		}
	}
	
	private static String choice2() {
		
		int i = 0;
		StringBuilder temp = new StringBuilder();
		temp.append(str.charAt(i));
		i++;
		while ( i < str.length()) {
			
			if (i %2 == 0) {
				temp.append(str.charAt(i));
				i++;
			} else {
				temp.append("#");
				i++;
			}
		}
		return temp.toString();
	}
	
	private static String choice3() {
		
		LinkedHashSet<Character> temp = new LinkedHashSet<>();
		
		for (int i= 0; i < str.length(); i++)
			temp.add(str.charAt(i));
		
		StringBuilder sb = new StringBuilder();
		for(Character c : temp) {
			sb.append(c);
		}
		return sb.toString();
	}
	
	private static String choice4() {
		
		int i = 0;
		StringBuilder temp = new StringBuilder();
		temp.append(str.charAt(i));
		i++;
		while ( i < str.length()) {
			
			if (i %2 == 0) {
				temp.append(str.charAt(i));
				i++;
			} else {
				temp.append(Character.toUpperCase(str.charAt(i)));
				i++;
			}
		}
		return temp.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringOperation so = new StringOperation();
		
		System.out.println("Please enter the string on which operations need to be performed");
		
		Scanner scanner = new Scanner(System.in);
		
		so.str = scanner.nextLine();
		
		System.out.println("Please enter your choice from numbers 1 through 4 which are as follows:");
		System.out.println("1. Add the String to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String");
		System.out.println("4. Change odd characters to upper case");

		Scanner scanner1 = new Scanner(System.in);
		so.choice = scanner1.nextInt();
		
		options();
		System.out.println("String Operation Result: " + so.str + " for choice number: " + so.choice);
		
	}

}
