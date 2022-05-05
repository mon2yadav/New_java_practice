package array_programs;

import java.util.Scanner;

public class ForLoop_demo {
	
	public void getdata(int num) {
		for (int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+i*num);
		}
		
	}
	public void readdata(String name)
	{
		for(int j=0; j<=10; j++)
		{
			System.out.println(name + j);
		}
	}
	
	public static void main(String[] args) {
		ForLoop_demo ob=new ForLoop_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int numo=sc.nextInt();
		
		ob.getdata(numo);
		System.out.println("please enter the String");
		String name=sc.next();
		ob.readdata(name);
	}

}