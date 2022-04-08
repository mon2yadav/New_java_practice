package array_programs;

import java.util.Scanner;

public class OddEven_checkArray {

	public void checkoddeven() {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		for(int i=0; i<=4; i++)
		{
		a[i]=sc.nextInt();
		}
		for(int j=0; j<=4; j++)
		{
			if(a[j]%2==0)
			{
			System.out.println(a[j]+" is a even number");	
			}
			else
			{
				System.out.println(a[j]+" is a odd number");
			}
		}
	}
	
	public static void main(String[] args) {
		OddEven_checkArray ob=new OddEven_checkArray();
		ob.checkoddeven();
		
	}
}
