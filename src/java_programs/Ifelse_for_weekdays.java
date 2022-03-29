package java_programs;

import java.util.Scanner;

public class Ifelse_for_weekdays {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the name of day");
		String input=sc.next();
		if(input.equals("monday")||input.equals("Monday"))
		{
			System.out.println("First day of week");
		}
		else if(input.equals("tuesday")||input.equals("Tuesday"))
		{
			System.out.println("Second day of week");
		}
		else if(input.equals("wednesday")||input.equals("Wednesday"))
		{
			System.out.println("Third day of week");
		}
		else if(input.equals("thrusday")||input.equals("Thrusday"))
		{
			System.out.println(input=="Forth day of week");
		}
		else if(input.equals("friday")||input.equals("Friday"))
		{
			System.out.println("Fifth day of week");
		}
		else if(input.equals("saturday")||input.equals("Saturday"))
		{
			System.out.println("Sixth day of week");
		}
		else if(input.equals("sunday")||input.equals("Sunday"))
		{
			System.out.println("Sunday is the holiday");
		}
		else
		{
			System.out.println("Wronge entity");
		}
	}
}
