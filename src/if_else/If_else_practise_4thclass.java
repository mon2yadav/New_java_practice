package if_else;

import java.util.Scanner;

public class If_else_practise_4thclass {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	public void add() {
		System.out.println("Enter two number for add");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	}
	
	public void sub() {
		System.out.println("Enter two number for subtract");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		If_else_practise_4thclass ob=new If_else_practise_4thclass();
	Scanner	sc=new Scanner(System.in);
	System.out.println("Press 1 for add and 2 for sub");
	int choice=sc.nextInt();
	if(choice==1)
	{
		ob.add();
	}
	else if(choice==2)
	{
		ob.sub();
	}
	else
	{
		System.out.println("wrong choice");
	}
		
	}

}
