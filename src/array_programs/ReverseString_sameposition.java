package array_programs;

import java.util.Scanner;

public class ReverseString_sameposition {

	public void getreverse(String input)
	{
		String [] str=input.split(" ");
		String out="";
		for(int i=0; i<=str.length-1; i++)
		{
			char[] c=str[i].toCharArray();
			for(int k=c.length-1; k>=0; k--)
			{
				out=out+c[k];
			}
			out=out+" ";
		}
		System.out.println(out);
	}
	public static void main(String[] args) {
		ReverseString_sameposition ob=new ReverseString_sameposition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String data=sc.nextLine();
		ob.getreverse(data);
	}
}
