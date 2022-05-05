package if_else;

import java.util.Scanner;

public class Switch_class_demo {

	public void getdata(String input) {
		switch (input.toLowerCase()) {
		case "sunday": {
			System.out.println("Sunday is the Holiday");
			break;

		}
		case "monday": {
			System.out.println("Monday is the Ist day of week");
			break;
		}

		case "tuesday": {
			System.out.println("Tuesday is the 2nd day of weeek");
			break;
		}
		case "wednesday": {
			System.out.println("Wednesday is the 3rd day of week");
			break;
		}
		case "thursday": {
			System.out.println("Thrusday is the 4th day of week");
			break;
		}
		case "friday": {
			System.out.println("Friday is the 5th day of week");
			break;
		}
		case "saturday": {
			System.out.println("Saturday is the 6th day of week");
			break;
		}
		default: {
			System.out.println("Wrong choice ");
		}
		}
	}

	public static void main(String[] args) {
		Switch_class_demo ob = new Switch_class_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the weekday");
		String weekday = sc.next();
		ob.getdata(weekday);
	}

}
