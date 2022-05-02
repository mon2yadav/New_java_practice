package if_else;

import java.util.Scanner;

public class If_else_weakdays_3rdclass {
	 static Scanner sc = new Scanner(System.in);
	public static void weakdays() {
		try {
			
			System.out.println("Please enter the day name");
			 String dayname=sc.next();
			 if(dayname.equalsIgnoreCase("monday"))
			 {
				 System.out.println("1st day of Weak");
			 }
			 else if(dayname.equalsIgnoreCase("tuesday"))
			 {
				 System.out.println("2nd day of weak");
			 }
			 else if(dayname.equalsIgnoreCase("wednesday"))
			 {
				 System.out.println("3rd day of weak");
			 }
			 else if(dayname.equalsIgnoreCase("thrusday"))
			 {
				 System.out.println("4th day of weak");
			 }
			 else if(dayname.equalsIgnoreCase("friday"))
			 {
				 System.out.println("5th day of weak");
			 }
			 else if(dayname.equalsIgnoreCase("saturday"))
			 {
				 System.out.println("6th day of weak");
			 }
			 else if(dayname.equalsIgnoreCase("sunday"))
			 {
				 System.out.println("Sunday is the holiday");
			 }
			 else
			 {
				 System.out.println(" Wronge entity");
			 }}
			catch(Exception e)
			{
				System.out.println("Issue in get weak day name "+e);
			}
		}

	public static void monthname() {
		System.out.println("Please enter the month name");
		 String monthname=sc.next();
		 if(monthname.equalsIgnoreCase("january")||monthname.equalsIgnoreCase("march")||monthname.equalsIgnoreCase("may")||monthname.equalsIgnoreCase("july")
				 ||monthname.equalsIgnoreCase("august")||monthname.equalsIgnoreCase("october")||monthname.equalsIgnoreCase("december"))
		 {
			 System.out.println("31st day in this month");
		 }
		 else if(monthname.equalsIgnoreCase("february"))
			 
		 {
			 System.out.println("enter the year");
			 int year=sc.nextInt();
			 if(year%4==0)
			 {
				System.out.println("this is  lear year"); 
				System.out.println(" In this year february 29 days");
			 }
			 else
			 {
				 System.out.println("This is not leap year");
				 System.out.println("In this year february is 28 days");
			 }
			 
		 }
		 else if(monthname.equalsIgnoreCase("april")||monthname.equalsIgnoreCase("june")||monthname.equalsIgnoreCase("September")
				 ||monthname.equalsIgnoreCase("november"))
		 {
			 System.out.println("30 days in this month");
		 }
		 else
		 {
			 System.out.println("wronge entity");
		 }
		
	}

	
	public static void main(String[] args) {
		
		weakdays();
		monthname();
	}
}
