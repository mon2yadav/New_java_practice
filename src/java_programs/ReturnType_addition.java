package java_programs;

import java.util.Scanner;

public class ReturnType_addition {

	
	public void getadditon(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void getsubtraction(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		int a,b,a1,b1;
		ReturnType_addition ob=new ReturnType_addition();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the two no. for add");
		 a=sc.nextInt();
		 b=sc.nextInt();
		ob.getadditon(a, b);
		System.out.println("Please enter the two no. for subtract");
		 a1=sc.nextInt();
		 b1=sc.nextInt();
		ob.getsubtraction(a1, b1);
		
	}
}
