package array_programs;

import java.util.Scanner;

public class Prime_number_choicewise {

	
	public void getprimenumber()
	{
		for(int i=2; i<=9; i++)
		{
			int f=0;
			for (int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					System.out.println(i+" is not prime number");
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(i+ " is a prime number");
			}

		    
		}
	}
	
	public static void main(String[] args) {
		Prime_number_choicewise ob=new Prime_number_choicewise();
		Scanner sc=new Scanner(System.in);
		ob.getprimenumber();
				
	}
}
