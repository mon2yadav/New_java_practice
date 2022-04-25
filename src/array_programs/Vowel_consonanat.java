package array_programs;

import java.util.Scanner;

public class Vowel_consonanat {

	
	public void getdate()
	{
		char c[]=new char[5];
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the character");
			for(int i=0; i<=4; i++)
			{
				c[i]=sc.next().charAt(0);
			}
		}
		for(int j=0; j<=4; j++)
		{
			if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u')
			{
				System.out.println(c[j]+" is a vowel");
			}
			else
			{
				System.out.println(c[j]+" is a consonant");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Vowel_consonanat ob=new Vowel_consonanat();
		ob.getdate();
	}
}
