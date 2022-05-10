package array_practise_again;

import java.util.Scanner;

public class SecondMax_demo {
	
	public int getdata(int arr[])
	{
		int max=0;
		int secondmax=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(max<arr[i])
			{
				secondmax=max;
				max=arr[i];
			}
			else if(secondmax<arr[i])
			{
				secondmax=arr[i];
			}
		}
		
		
		return secondmax;
	}
	
	public static void main(String[] args) {
		SecondMax_demo ob=new SecondMax_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of number");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("please enter the numbers");
		for(int k=0; k<=a.length-1; k++)
		{
			a[k]=sc.nextInt();
		}
		int data = ob.getdata(a);
		System.out.println("Second max number is  "+data);
		
	}

}
