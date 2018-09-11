package Lab3;

/**
 * Lab 3
 * @author kavyakumar
 *
 *	3.2: Create a method that accepts a String and checks if it is 
 *	a positive string. A string is considered a positive string, if 
 *	on moving from left to right each character in the String comes 
 *	after the previous characters in the Alphabetical order.
 *
 *	For Example: ANT is a positive String (Since T comes after N and 
 *	N comes after A). The method should return true if the entered string is positive.
 *
 */
public class StringPositive {

	static boolean checkPositive(String str) {
		
		if (str == null || str.length() == 0)
			return false;
		
		int i = 1;
		while (i < str.length()) {
			
			int first = str.charAt(i - 1) - '0';
			int second = str.charAt(i) - '0';
			if ( second >= first) {
				i++;
				continue;
			} else
				break;
		}
		return (i == str.length() - 1) ? false : true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ANT";
		boolean check = checkPositive(str);
		
		if(check)
			System.out.println(str +" is a Positive String");
		else
			System.out.println(str +" is a Negative String");

	}

}
