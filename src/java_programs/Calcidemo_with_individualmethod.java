package java_programs;

import java.util.Scanner;

public class Calcidemo_with_individualmethod {
	int a,b,c,d,e,f;
	Scanner sc=new Scanner(System.in);

	public void add()
	{
		
		System.out.println("Enter the two no. for Add");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
		
	}
	public void sub()
	{
		
		System.out.println("Enter two no. for Subtract");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println(c);
	}
	public void mul()
	{
		
		System.out.println("Enter two no. for multiplication");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println(c);
		  
	}
	public void divide()
	{
		
		System.out.println("Enter two no. for divide");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println(c);
	}
	public void dividewithdecimal()
	{
		System.out.println("Enter two decimal digit for divide");
		float k=sc.nextFloat();
		float m=sc.nextFloat();
		float n=k/m;
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		
		Calcidemo_with_individualmethod ob=new Calcidemo_with_individualmethod();
		ob.add();
		ob.sub();
		ob.mul();
		ob.divide();
		ob.dividewithdecimal();
	}

}
