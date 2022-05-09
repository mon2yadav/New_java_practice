package array_practise_again;

import java.util.Scanner;

public class MaximumNumber_demo {
	
	public int getdata(int a[])
	{
		int max=0; 
		for(int j=0; j<=a.length-1; j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		MaximumNumber_demo ob=new MaximumNumber_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the quantity of numbers");
		int size =sc.nextInt();
		System.err.println("Enter the numbers");
		int a[]=new int[size];
		for(int i=0; i<=size-1; i++)
		{
			a[i]=sc.nextInt();
		}
		int out = ob.getdata(a);
		System.out.println("Maximum number is "+out);
	}

}
