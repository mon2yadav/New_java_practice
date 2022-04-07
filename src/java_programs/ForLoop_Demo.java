package java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ForLoop_Demo {

	public void getdata() {
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"*7="+i*7);
		}
		
	}
	public void getchardata() {
		for(char i='A'; i<='Z'; i++)
		{
		System.out.println(i);	
		}
	}
	 
	public void gettable(int num)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i*num);
		}
	}
	

	
	public static void main(String[] args) {
		ForLoop_Demo ob=new ForLoop_Demo();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter the number");
//		int num=sc.nextInt();
//		ob.gettable(num);
		ob.getdata(); 
//		ob.getchardata();
		
		
	}
}
