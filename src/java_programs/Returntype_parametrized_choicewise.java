package java_programs;

import java.util.Scanner;

public class Returntype_parametrized_choicewise {

	
	public void add(int a, int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int a, int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public void multi(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		int a,b;;
		Returntype_parametrized_choicewise ob=new Returntype_parametrized_choicewise();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the symbol +-*/");
		String choice=sc.next();
		System.out.println("Enter the two input to calculate ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(choice.equals("+"))
		{
			
			ob.add(a, b);
		}
		else if(choice.equals("-"))
		{
			ob.sub(a, b);
		}
		else if(choice.equals("*"))
		{
			ob.multi(a, b);
		}
		else if(choice.equals("/"))
		{
			ob.div(a, b);
			
		}
		else
		{
			System.out.println("Wronge entity ");
		}
	
		
	}
}
