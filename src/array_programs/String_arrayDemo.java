package array_programs;

import java.util.Scanner;

public class String_arrayDemo {

	Scanner sc=new Scanner(System.in);
	
	public void getdata()
	{
		String[] a=new String[4];
		
		System.out.println("Please enter the name");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.next();
		}
		for(int j=4; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}
	
	public void getdata1()
	{
		char[]  a=new char[5];
		System.out.println("Please enter the character");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.next().charAt(0);
		}
		for(int j=4; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}
	
	public static void main(String[] args) {
		String_arrayDemo ob=new String_arrayDemo();
		ob.getdata();
//		ob.getdata1();
	}
}
