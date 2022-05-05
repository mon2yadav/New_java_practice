package array_practise_again;

import java.util.Scanner;

public class Pallindrom_demo {
	public String  getdata(String input) {
		Scanner sc=new Scanner(System.in);
		String out="";
	  char	c[]=input.toCharArray();
	  int len=c.length-1;
	  for(int i=len; i>=0; i--)
	  {
		  out=out+c[i];
		 
	  }
	  if(out.equals(input))
	  {
		  System.out.println(input+ "  is a pallindrome");
	  }
	  else
	  {
		  System.out.println(input+ " is not a pallindrome");
	  }
	return out;
	  
		
	}
	public static void main(String[] args) {
		Pallindrom_demo ob=new Pallindrom_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a String");
		String input=sc.next();
		String out=ob.getdata(input);
		System.out.println(out);
		
	}

}
