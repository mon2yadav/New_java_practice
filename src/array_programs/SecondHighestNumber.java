package array_programs;

import java.util.Scanner;

public class SecondHighestNumber {

	public void getdata(int arr[])
	{
		int temp=0;
		for(int j=0; j<=arr.length-1; j++)
		{
			for(int k=j+1; k<=arr.length-1; k++)
			{
				if(arr[j]>arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int l=0; l<=arr.length-1; l++)
		{
			System.out.println(arr[l]);
		}
		System.out.println("Second highest value is "+arr[arr.length-2]);
	}
	
	public static void main(String[] args) {
		SecondHighestNumber ob = new SecondHighestNumber();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the size of array");
			int size=sc.nextInt();
			int []a=new int[size];
			System.out.println(" please enter the number");
			for(int i=0; i<=a.length-1; i++)
			{
				a[i]=sc.nextInt();
			}
			ob.getdata(a);
		}
	}
}
