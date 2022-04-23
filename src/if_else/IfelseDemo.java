package if_else;

import java.util.Scanner;

public class IfelseDemo {

	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		
		if(age<18)
		{
			System.out.println("Not Eligible for vote");
		}
		else if(age>=18&&age<=60)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Eligible for vote as senior citizen");
		}
	}
}
