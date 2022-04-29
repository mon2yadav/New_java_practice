package if_else;

import java.util.Scanner;

public class If_else_vowel_2ndclass {

	
	public static void main(String[] args) {
//		int a=10;     //assignment
//		int b==100; // conditional operator
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the character ");
		char input=sc.next().charAt(0);
		if(input=='a'||input=='e'||input=='o'||input=='u'||input=='i')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Consonent");
		}
		
		
	}
}
