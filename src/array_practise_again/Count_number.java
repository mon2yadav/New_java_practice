package array_practise_again;

import java.util.Scanner;

public class Count_number {
	public void getdata(long num, int num1) {
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
		System.out.println(num1+" is coming "+ count+" times");
		
	}
	
	public static void main(String[] args) {
		Count_number ob=new Count_number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		long input = sc.nextLong();
		System.out.println("enter the number for find ");
		int input1 = sc.nextInt();
		ob.getdata(input, input1);
	}

}
