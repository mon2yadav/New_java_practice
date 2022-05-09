package array_practise_again;

import java.util.Scanner;

public class SecondMax_swapping {
	
	public void getdata(int arr[])
	{
		int temp=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=i+1; j<=arr.length-1; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0; k<=arr.length-1; k++)
		{
			System.out.println(arr[k]);
		}
		System.out.println("Second max number is   "+arr[arr.length-2]);
	}
	public static void main(String[] args) {
		
		SecondMax_swapping ob=new SecondMax_swapping();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of numbers");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Please enter the number");
		for(int l=0; l<=a.length-1; l++)
		{
			a[l]=sc.nextInt();
		}
		ob.getdata(a);
		
	}

}
