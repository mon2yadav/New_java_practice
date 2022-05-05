package array_practise_again;

import java.util.Scanner;

public class Eligible_array {
	
	public void getdata() {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 recodes for checking the eligibility");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0; j<=4; j++)
		{
			if(a[j]<18)
			{
				System.out.println(a[j]+ " is not eligible");
			}
			else
			{
				System.out.println(a[j]+ " is eligible");
			}
		}
	}
	
	public static void main(String[] args) {
		Eligible_array ob=new Eligible_array();
		ob.getdata();
	}

}
