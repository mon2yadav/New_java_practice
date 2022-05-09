package array_practise_again;

import java.util.Scanner;

public class ArmStrong_demo {
	
	
	public void getdata(int num)
	{
		int b=0;
		int temp=num;
		int c=0;
		for(;num>0;)
		{
			b=num%10;
			num=num/10;
			c=c+(b*b*b);
		}
		if(temp==c)
		{
			System.out.println(temp+" is armstrong");
		}
		else
		{
			System.out.println(temp+" is not armstrong");
		}
	}
	public static void main(String[] args) {
		ArmStrong_demo ob=new ArmStrong_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please enter the integer");
		int input = sc.nextInt();
		ob.getdata(input);
	}

}
