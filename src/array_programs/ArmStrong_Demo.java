package array_programs;

import java.util.Scanner;

public class ArmStrong_Demo {

	
	public void getdataofarmstrong(int num)
	{
		int b;
		int c=0;
		int temp=num;
		for(;num>0;)
		{
			b=num%10;
			num=num/10;
			c=c+(b*b*b);
		}
		if(temp==c)
		{
			System.out.println(temp+" is  armstrong");
		}
		else
		{
			System.out.println(temp+" is not armstrong");
		}
	}
	
	public static void main(String[] args) {
		ArmStrong_Demo ob=new ArmStrong_Demo();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the number");
			int input=sc.nextInt();
			ob.getdataofarmstrong(input);
		}
	}
}
