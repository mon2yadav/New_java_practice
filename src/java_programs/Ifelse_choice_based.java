package java_programs;

import java.util.Scanner;

public class Ifelse_choice_based {
  
	
	Scanner sc=new Scanner(System.in);
	int input1,input2,output;
	public void add()
	{
		System.out.println("Please enter two no. for add");
		 input1=sc.nextInt();
		 input2=sc.nextInt();
		output=input1+input2;
		System.out.println(output);
		
	}
	public void sub() {
		System.out.println("Please enter two no. for subtract");
		input1=sc.nextInt();
		input2=sc.nextInt();
		output=input1-input2;
		System.out.println(output);
	}
	public void multi() {
		System.out.println("Please enter two no. for multiply");
		input1=sc.nextInt();
		input2=sc.nextInt();
		output=input1*input2;
		System.out.println(output);
	}
	public void divide()
	{
		System.out.println("Please enter two no. for divide");
		input1=sc.nextInt();
		input2=sc.nextInt();
		output=input1/input2;
		System.out.println(output);
	}
	
	
	
	
	public static void main(String[] args) {
		Ifelse_choice_based ob=new Ifelse_choice_based();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1 for add , 2 for subtract,3 for multiply");
		int choice=sc.nextInt();
		if(choice==1)
		{
			ob.add();
		}
		else if(choice==2)
		{
			ob.sub();
		}
		else if(choice==3)
		{
			ob.multi();
		}
		else if(choice==4)
		{
			ob.divide();
		}
		else
		{
			System.out.println("wronge choice");
		}
	}
}
