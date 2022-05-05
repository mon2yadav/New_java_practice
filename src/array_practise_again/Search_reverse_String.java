package array_practise_again;

import java.util.Scanner;

public class Search_reverse_String {
	
	public void getdata(String input , String choice)
	{
		boolean flag=true;
		String[] str = input.split(" ");
		String out="";
		for(int i=0; i<=str.length-1; i++)
		{
			if(str[i].equals(choice))
			{
				flag=false;
				char[] c = choice.toCharArray();
				for(int j=c.length-1; j>=0; j--)
				{
					out=out+c[j];
					
				}
				System.out.println(out);
				
			}
			
			
		}
		if(flag==true)
		{
			System.out.println("This word is not available in this sentence ");
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Search_reverse_String ob=new Search_reverse_String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String input = sc.nextLine();
		System.out.println("Enter the string for search ");
		String data = sc.next();
		ob.getdata(input, data);
		
	}

}
