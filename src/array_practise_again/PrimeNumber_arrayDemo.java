package array_practise_again;

import java.util.Scanner;

public class PrimeNumber_arrayDemo {
	
	public void getdata() {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size");
		int size = sc.nextInt();
		int []a=new int[size];
		
		System.out.println("Please enter the number");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0; j<=4; j++)
		{
			boolean flag=false;
			if(a[j]==0||a[j]==1)
			{
				System.out.println(a[j]+" number is not prime");
			}
			else
			{
				for(int k=2; k<a[j]; k++)
				{
					if(a[j]%k==0)
					{
						System.out.println(a[j]+" number is not prime");
						flag=true;
						break;
					}
				}
				if(flag==false)
				{
					System.out.println(a[j]+" number is prime");
				}
			}
		}
		
	
	}
	
	public static void main(String[] args) {
		PrimeNumber_arrayDemo ob=new PrimeNumber_arrayDemo();
		ob.getdata();
	}

}
