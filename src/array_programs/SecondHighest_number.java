package array_programs;

import java.util.Scanner;

public class SecondHighest_number {

	
	public int getdata(int arr[])
	{
		int max=0;
		int secondmax=0;
		for(int j=0; j<=arr.length-1; j++)
		{
			if(max<arr[j])
			{
				secondmax=max;
				max=arr[j];
			}
			else if(secondmax<arr[j])
			{
				secondmax=arr[j];
			}
		}
		return secondmax;
		
		
	}
	
	
	public static void main(String[] args) {
		
		SecondHighest_number ob=new SecondHighest_number();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the size of array");
			int size=sc.nextInt();
			int [] a=new int[size];
			System.out.println("Please enter the number");
			for(int i=0; i<=a.length-1; i++)
			{
				a[i]=sc.nextInt();
			}
			int data=ob.getdata(a);
			System.out.println("Second max is "+data);
		}
				
	}
}
