package array_practise_again;

import java.util.Scanner;

public class Vowel_consonanat_array {
	
	public void getdata() {
		char a[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the character");
		for(int i=0; i<=4; i++)
		{
			a[i]=sc.next().charAt(0);
		}
		for(int j=0; j<=4; j++)
		{
			if(a[j]=='a'||a[j]=='e'||a[j]=='i'||a[j]=='o'||a[j]=='u')
			{
				System.out.println(a[j]+" is a vowel");
			}
			else
			{
				System.out.println(a[j]+" is a consonant");
			}
		}
	}
	
	public static void main(String[] args) {
		Vowel_consonanat_array ob=new Vowel_consonanat_array();
		ob.getdata();
	}

}
