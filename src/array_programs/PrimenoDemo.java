package array_programs;

import java.util.Scanner;

public class PrimenoDemo {

	
	public void getvalidate(int num) {
		int flag=0;
		if(num==0||num==1)
		{
			System.out.println(num+" is not prime number");
		}
		else {
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not prime number");
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
		PrimenoDemo ob=new PrimenoDemo();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Please enter the number");
			 int input=sc.nextInt();
			 ob.getvalidate(input);
		}
	}
}
