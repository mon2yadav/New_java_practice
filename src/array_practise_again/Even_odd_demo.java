package array_practise_again;

import java.util.Scanner;

public class Even_odd_demo {
	
	
	public void getdata() {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the 10 integer records");
		for (int i=0; i<=9; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0; j<=9; j++)
		{
			if(a[j]%2==0)
			{
				System.out.println(a[j]+ 		"is a odd number");
			}
			else
			{
				System.out.println(a[j]+ " is a even number");
			}
		}
	}
	public static void main(String[] args) {
		Even_odd_demo ob=new Even_odd_demo();
		ob.getdata();
	}

}
