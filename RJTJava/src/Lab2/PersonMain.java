package Lab2;
/**
 * Lab 2
 * @author kavyakumar
 *
 *	2.3 
 *	Also Create “PersonMain.java” program and write code for following operations:
 *
		a) Create an object of Person class and specify person details through constructor.
		b) Display the details in the format given in Lab assignment 2.1
		
		------------------------------------------------------------------------
		2.4: Modify Lab assignment 2.3 to accept phone number of a person. 
		Create a new method to implement the same and also define method for displaying 
		person details.
 */

public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("Divya", "Bharathi");
		person.setGender(Gender.F);
		
//		System.out.println("Person Details:");
//		System.out.println("---------------");
//		System.out.println("First Name: "+person.firstName);
//		System.out.println("Last Name: "+person.lastName);
//		System.out.println("Gender: "+person.gender);

		person.setPhoneNo(12345678);
		
		person.personDetails();

	}
}
