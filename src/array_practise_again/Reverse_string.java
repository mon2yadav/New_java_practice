package array_practise_again;

import java.util.Scanner;

public class Reverse_string {
	
	public String getdata(String input) 
	{
		
		String out="";
	char[]	c=input.toCharArray();
	int len=c.length-1;
	for(int i=len; i>=0; i--)
	{
		out=out+c[i];
	}
	return out;
		
	}
	public static void main(String[] args) {
		Reverse_string ob=new Reverse_string();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the String for reverse");
		String input=sc.next();
		String out1=ob.getdata(input);
		System.out.println(out1);
		
		
	}

}
