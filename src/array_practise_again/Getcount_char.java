package array_practise_again;

import java.util.Scanner;

public class Getcount_char {
	
	public int  getdetail(String input, char c)
	{
		int count=0;
		char[] out = input.toCharArray();
		for(int i=0; i<=out.length-1; i++)
		{
			if(out[i]==c)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Getcount_char ob=new Getcount_char();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = sc.next();
		System.err.println("Enter the character for count");
		char c = sc.next().charAt(0);
		int out = ob.getdetail(input, c);
		System.out.println(out);
		
	}

}
