package Lab3;

import java.util.Scanner;

/**
 * Lab 3
 * @author kavyakumar
 *
 *	3.5: Create a method to accept product purchase date and warrantee 
 *	period (in terms of months and years). Print the date on which 
 *	warrantee of product expires.
 */
public class ProductExpiry extends DatesDuration{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductExpiry pe = new ProductExpiry();
		
		System.out.println("Enter the product purchase date in the format: yyyy-mm-dd");
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split("-",3);
		
		System.out.println("Enter the warrantee period of the product in the format: yyyy-mm");
		Scanner sc1 = new Scanner(System.in);
		
		String[] input1 = sc1.nextLine().split("-",2);
		
		
		int y1 = Integer.parseInt(input[0]);
		int y2 = Integer.parseInt(input1[0]);
		
		int m1 = Integer.parseInt(input[1]);
		int m2 = Integer.parseInt(input1[1]);
		
		int d1 = Integer.parseInt(input[2]);
		int d2 = 1; //start day of each month
		
		ProductExpiry.printDuration(d1, m1, y1, d2, m2, y2);
		System.out.println("This is the duration when the product will expire");
	}

}
