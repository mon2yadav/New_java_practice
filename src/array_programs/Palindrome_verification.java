package array_programs;

import java.util.Scanner;

public class Palindrome_verification {

	
	public String getdata(String input)
	{
		
		String out="";
		char [] c=input.toCharArray();
		
		int len=c.length-1;
		for(int i=len; i>=0; i--)
		{
			out=out+c[i];
			
			
		}
		if(out.equals(input))
		{
			System.out.println(input + " is a pallindrome");
		}
		else
		{
			System.out.println(input + " is not a pallindrome");
		}
		return out;
	}
	
	public static void main(String[] args) {
		Palindrome_verification ob=new Palindrome_verification ();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the name");
			String input=sc.next();
			String data=ob.getdata(input);
			System.out.println(data);
		}
		
	}
}
