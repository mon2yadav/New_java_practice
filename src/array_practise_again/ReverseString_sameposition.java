package array_practise_again;

import java.util.Scanner;

public class ReverseString_sameposition {
	
	public void getdata(String input)
	{
		String[] str = input.split(" ");
		String out="";
		for(int i=0; i<=str.length-1; i++)
		{
			char[] c = str[i].toCharArray();
			for(int j=c.length-1; j>=0; j--)
			{
				out=out+c[j];
			}
			out=out+" ";
		}
		System.out.println(out);
	}

	
	public static void main(String[] args) {
		ReverseString_sameposition ob=new ReverseString_sameposition();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the sentence");
		String data=sc.nextLine();
		ob.getdata(data);
		
	}
	
	
}
