package java_programs;

import java.util.Scanner;

public class Switch_demo {
	
	public void getweekdata(String input) {
		switch(input)
		{
		case "Sunday":
		{
			System.out.println(" Sunday is holiday");
			break;
		}
		case"Monday":
		{
			System.out.println("Monday is the Ist day of week");
			break;
		}
		case"Tuesday":
		{
			System.out.println("Tuesday is the IInd day of week");
			break;
		}
		case"Wednesday":
		{
			System.out.println("Wednesday is the IIIrd day of week");
			break;
		}
		case"Thursday":
		{
			System.out.println("Thursday is the IVth day of week");
			break;
		}
		case"Friday":
		{
			System.out.println("Friday is the Vth day of week");
			break;
		}
		case"Saturday":
		{
			System.out.println("Saturday is the Vth day of week");
			break;
		}
		default :
		{
			System.out.println("Wronge entity");
		}
		
		}
	}
	
	public static void main(String[] args) {
		Switch_demo ob=new Switch_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the weekday");
		String weekday=sc.next();
		ob.getweekdata(weekday);
	}

}
