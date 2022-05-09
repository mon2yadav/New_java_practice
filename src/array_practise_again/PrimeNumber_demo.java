package array_practise_again;

import java.util.Scanner;

public class PrimeNumber_demo {
	
	public void getvalidate(int num)
	{
		int flag=0;
		if(num==0||num==1)
		{
			System.out.println(num+" is not prime");
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+" is prime number");
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		PrimeNumber_demo ob=new PrimeNumber_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		ob.getvalidate(num);
	}

}
