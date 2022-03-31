package java_programs;

import java.util.Scanner;

public class Ifelse_calci {
	Scanner sc=new Scanner(System.in);
   int input1,input2,output;
	public void getdata() {
		
	    System.out.println("Please enter the no.");
	     input1=sc.nextInt();
//	    System.out.println("please enter + for add and - for subtract");
	    String choice=sc.next();
//	    System.out.println("please enter the 2nd no.");
	     input2=sc.nextInt();
	     output=0;
	    if(choice.equals("+"))
	    {
	    	output=input1+input2; 
	    }
	    else if(choice.equals("-"))
	    {
	    	output=input1-input2;
	    }
	    else if(choice.equals("*"))
	    {
	    	output=input1*input2;
	    }
	    else if(choice.equals("/"))
	    {
	    	output=input1/input2;
	    }
	    else
	    {
	    	System.out.println("wronge choice");
	    }
	    System.out.println(output);
	}
	
	
	
	public static void main(String[] args) {
		Ifelse_calci ob=new Ifelse_calci();
		
		ob.getdata();
	}
}
