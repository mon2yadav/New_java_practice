package array_programs;

import java.util.Scanner;

public class AgeEligible_array {
	public void getage() {
		int a[]=new int[5];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("please enter the age");
			for(int i=0; i<=4; i++)
			{
				a[i]=sc.nextInt();
			}
		}
		for(int j=0; j<=4; j++) {
			if(a[j]<18)
			{
				System.out.println("Not Eligible for vote");
			}
			else if(a[j]>=18&& a[j]<=60)
			{
				System.out.println("Eligible for vote");
			}
			else
			{
				System.out.println("Eligible with senior citizen");
			}
						
		}
	}

	
	
	public static void main(String[] args) {
		AgeEligible_array ob=new AgeEligible_array();
		ob.getage();
	}
}
