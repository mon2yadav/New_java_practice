package array_programs;

import java.util.Scanner;

public class Mximum_numberDemo {

	public int getdata(int a[])
	{
		int max=0;
		for(int j=0; j<=a.length-1; j++ )
		{
			if(a[j]>max)
			{
				max=a[j];
			}
			
		}
		return max;
		
		
		
	}
	
	public static void main(String[] args) {
		Mximum_numberDemo ob=new Mximum_numberDemo();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the array size");
			int size=sc.nextInt();
			System.out.println("Please enter the numbers");
			int [] a=new int[size];
			for(int i=0; i<size; i++)
			{
				a[i]=sc.nextInt();
			}
			int data=ob.getdata(a);
			System.out.println("Maximum number is "+data);
		}
		
	}
}
