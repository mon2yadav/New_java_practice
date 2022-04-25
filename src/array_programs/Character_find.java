package array_programs;

import java.util.Scanner;

public class Character_find {
	
	public int getdata(String input, char data)
	{
		int count=0;
		char[] out=input.toCharArray();
		for(int i=0; i<=out.length-1; i++)
		{
			if(out[i]==data)
			{
				count++;
			}
		}
		return count;
		}
	public static void main(String[] args) {
		
		  Character_find ob=new Character_find();
		  try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the word"); 
			  String input=sc.next();
			  System.out.println("Enter the character for find"); 
			  char data=sc.next().charAt(0);
			  int out1=ob.getdata(input, data);
			  System.out.println(out1);
		}
		 
	}

}
