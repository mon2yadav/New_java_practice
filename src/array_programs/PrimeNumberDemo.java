package array_programs;

import java.util.Scanner;

public class PrimeNumberDemo {

	
	public String[] getdata(int []a)  {
		String  arr[]=new String[10];
		for(int k=0; k<=9; k++)
		{
			boolean flag=false;
			if(a[k]==0||a[k]==1)
			{
				arr[k]=a[k]+"no. is not prime";
			}
			else
			{
				for(int j=2; j<a[k]; j++)
				{
					if(a[k]%j==0)
					{
						arr[k]=a[k]+"no. is not prime";
						flag=true;
						break;
					}
				}
				if(flag==false)
				{
					arr[k]=a[k]+"no. is  prime";
				}
			}
		}
		return arr;
		}
		
	
	
	public static void main(String[] args)  {
		PrimeNumberDemo ob=new PrimeNumberDemo();
		int a[]=new int[10];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the number");
			for(int i=0; i<=9; i++)
			{
				a[i]=sc.nextInt();
					}
		}
		String []data=ob.getdata(a);
		for(int j=0; j<=data.length-1; j++)
		{
			System.out.println(data[j]);
		}
	}
}
