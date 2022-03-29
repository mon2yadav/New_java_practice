package java_programs;

import java.util.Scanner;

public class Calcidemo {

	int a,b,c,d,e;
	Scanner sc=new Scanner(System.in);
	
	public void add()
	{
		
		System.out.println("please enter two no. for add");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a+b;
		 System.out.println("add result");
		 System.out.println(c);
		 System.out.println("enter two no. for multiply");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 d=a*b;
		 System.out.println("multiply result");
		 System.out.println(d);
		 System.out.println("enter two no. for divide");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 e=a/b;
		 System.out.println("divide result");
		 System.out.println(e);
		 System.out.println("enter two numbers for substract");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a-b;
		 System.out.println("subtract result");
		 System.out.println(c);
		 
	}
	
	
	public static void main(String[] args) {
		Calcidemo ob=new Calcidemo();
		ob.add();
	}
}
