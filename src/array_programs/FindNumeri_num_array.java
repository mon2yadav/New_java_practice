package array_programs;

import java.util.Scanner;

public class FindNumeri_num_array {
	
	public void getdata(long num, int num1)
	{
		int count=0;
		for(;num>0;)
		{
			long a=num%10;
			num=num/10;
			if(a==num1)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		FindNumeri_num_array ob=new FindNumeri_num_array();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please enter the number");
		long input=sc.nextLong();
		System.out.println("Please enter the number do u want");
		 int input1=sc.nextInt();
		 ob.getdata(input,input1);
	}
}
