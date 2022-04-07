package array_programs;

import java.util.Scanner;

public class ArrayFirst_Demo {

	public void getdata() {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=4; j>=0; j--)
		{
			System.out.println(a[j]);
		}
//		public void getdata1()
//		{
//			int a[]=new int[6];
//			a[0]=13;
//			a[1]=14;
//			a[2]=15;
//			a[3]=16;
//			a[4]=17;
//			a[5]=18;
//			System.out.println(a[5]);
//			System.out.println(a[4]);
//			System.out.println(a[3]);
//			System.out.println(a[2]);
//			System.out.println(a[1]);
//			System.out.println(a[0]);
//			
//		}
		
		
		
		
		
				
		
	}
	
	
	public static void main(String[] args) {
		ArrayFirst_Demo ob=new ArrayFirst_Demo();
		ob.getdata();
	}
}
