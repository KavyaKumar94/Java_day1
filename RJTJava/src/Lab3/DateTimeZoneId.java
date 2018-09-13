package Lab3;
import java.time.ZonedDateTime;
import java.util.Scanner;
import java.time.ZoneId;
/**
 * Lab 3
 * @author kavyakumar
 * 
 * 	3.6: Create a method which accept zone id and print 
 * the current date and time with respect to given zone. 
 * (Hint: Few zones to test your code. America/New_York, Europe/London, 
 * Asia/Tokyo, US/Pacific, Africa/Cairo, Australia/Sydney etc.)
 * 
 */
public class DateTimeZoneId {

	public static void dateTimeForZoneID(ZoneId zone) {
		
		ZonedDateTime curr = ZonedDateTime.now(zone);
		System.out.println("The current date and time with respect to given zone is "+curr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the zone. eg: Asia/Tokyo");
		Scanner sc = new Scanner(System.in);
		
		ZoneId zoneid = ZoneId.of(sc.nextLine());
		
		dateTimeForZoneID(zoneid);
	}

}
