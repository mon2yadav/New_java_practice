package if_else;

import java.util.Scanner;

public class If_else_practise1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age");
		int age=sc.nextInt();
		if(age<18)
		{
			System.out.println("you are not eligible for vote");
		}
		else if(age>=18&&age<=60)
		{
			System.out.println("you are eligible for vote ");
		}
		else
		{
			System.out.println("You are eligible for vote with senior citizen");
		}
		
	}

}
