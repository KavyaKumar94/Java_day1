package Lab2;
/**
 * Lab 2
 * @author kavyakumar
 *
 *	2.1 Write a java program to print person details in the format as shown below:
 *
 *	Person Details:
 *	 ____________
 *
	First Name: Divya 
	Last Name: Bharathi 
	Gender: F
	Age: 20
	Weight: 85.55
	
	-------------------------------------------------------------------------------
	2.3: Refer the class diagram given below and create a person class.
	Figure 13: Class Diagram of Person
	Create default and parameterized constructor for Person class.
 */
public class Person {

	/* for Lab question 2.1
	 * 
	private String firstName;
	private String lastName;
	private char gender;
	private int age;
	private float weight;
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.firstName = "Divya";
		person.lastName = "Bharathi";
		person.gender = 'F';
		person.age = 20;
		person.weight = 85.55f;
		
		
		System.out.println("Person Details:");
		System.out.println("---------------");
		System.out.println("First Name: "+person.firstName);
		System.out.println("Last Name: "+person.lastName);
		System.out.println("Gender: "+person.gender);
		System.out.println("Age: "+person.age);
		System.out.println("Weight: "+person.weight);
	}
	*/
	
	String firstName;
	String lastName;
	Gender gender;
	int phoneNo;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	Person(String firstName, String lastName, int phoneNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
	}
	
	
	public void personDetails() {
		
		System.out.println("Person Details:");
		System.out.println("---------------");
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Gender: "+getGender());
		System.out.println("Phone Number: "+getPhoneNo());

	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	Gender getGender() {
		return gender;
	}

	void setGender(Gender gender) {
		this.gender = gender;
	}

	int getPhoneNo() {
		return phoneNo;
	}

	void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
