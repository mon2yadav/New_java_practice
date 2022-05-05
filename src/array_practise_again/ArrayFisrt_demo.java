package array_practise_again;

import java.util.Scanner;

public class ArrayFisrt_demo {
	Scanner sc=new Scanner(System.in);
	public void readdata() {
		char a[]=new char[5];
		System.out.println("please enter the character");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.next().charAt(0);
		}
		for(int j=4; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}
	
	public void showdata() {
		String a[]=new String[5];
		System.out.println("Please enter the String");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.next();
		}
		for(int j=4; j>=0; j--)
		{
			System.out.println(a[j]);
		}
	}
	
	public void getdata() {
		int a[]=new int[5];
		int b[]=new int[5];
		
		System.out.println("Please enter the number");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Please enter another list");
		for(int k=0; k<=4; k++)
		{
			b[k]=sc.nextInt();
		}
		for(int j=0; j<=4; j++)
		{
			System.out.println(a[j]);
		}
		System.out.println();
		for( int l=4; l>=0; l--)
		{
			System.out.println(b[l]);
		}
	}

	
	public static void main(String[] args) {
		ArrayFisrt_demo ob=new ArrayFisrt_demo();
//		ob.getdata();
//		ob.readdata();
		ob.showdata();
	}
}
