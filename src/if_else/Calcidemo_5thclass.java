package if_else;

import java.util.Scanner;

public class Calcidemo_5thclass {
	
	public static void getdata()
	{
	Scanner sc=new Scanner(System.in);
//	System.out.println("Please enter the first number");
	int input=sc.nextInt();
//	System.out.println("press the symbol + for add and - for subtract");
	String choice=sc.next();
//	System.out.println("Enter the second number");
	int input1=sc.nextInt();
	int output=0;
	if(choice.equals("+"))
	{
		output=input+input1;
	}
	else if(choice.equals("-"))
	{
		output=input-input1;
	}
	else
	{
		System.out.println("wrong choice");
	}
	System.out.println(output);
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
