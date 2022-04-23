package if_else;

import java.util.Scanner;

public class Ifelse_daycount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the month name");
	String name=sc.next();
	if(name.equalsIgnoreCase("january")||name.equalsIgnoreCase("march")||name.equalsIgnoreCase("may")||name.equalsIgnoreCase("july")
			||name.equalsIgnoreCase("august")||name.equalsIgnoreCase("october")||name.equalsIgnoreCase("december"))
	{
		System.out.println("31 days in this month");
	}
	else if(name.equalsIgnoreCase("february"))
	{
		System.out.println("28/29 days in this month");
	}
	else if(name.equalsIgnoreCase("april")||name.equalsIgnoreCase("june")||name.equalsIgnoreCase("september")||name.equalsIgnoreCase("november"))
	{
		System.out.println("30 day in this month");
	}
	else
	{
		System.out.println("wronge entity");
	}
		
}
}
