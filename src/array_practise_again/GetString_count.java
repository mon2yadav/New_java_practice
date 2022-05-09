package array_practise_again;

import java.util.Scanner;

public class GetString_count {
	
	public int  getdetail(String line, String  input) {
		int flag=0;
		int count=0;
		String[] str = line.split(" ");
//		char[] input1=line.toCharArray();
		for(int i=0; i<=str.length-1; i++)
		{
			if(str[i].equalsIgnoreCase(input))
			{
				count++;
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("This word not exist in line");
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		GetString_count ob=new GetString_count();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String line = sc.nextLine();
		System.out.println("Enter the String for count");
		String input = sc.next();
		int out = ob.getdetail(line, input);
		System.out.println(out);
	}

}
