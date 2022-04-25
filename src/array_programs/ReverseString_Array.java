package array_programs;

import java.util.Scanner;

public class ReverseString_Array {

	
	public String getdata(String input)
	{
		
		//input="ramwati";
		
		String out="";
		char[] c=input.toCharArray();
		int len=c.length-1;
		for(int i=len; i>=0; i--) {
			out=out+c[i];
		}
		return out;
		
	}
	public static void main(String[] args) {
		ReverseString_Array ob =new ReverseString_Array();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the name");
			String input=sc.next();
			

			String data=ob.getdata(input);
			System.out.println(data);
		}
		
	}
}
