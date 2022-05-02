package if_else;

import java.util.Scanner;

public class addditon_returnType_server {
	
	public void additon(int a ,int b) {
		
	
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		addditon_returnType_server ob=new addditon_returnType_server();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the two input");
		int input=sc.nextInt();
		int input1=sc.nextInt();
		ob.additon(input,input1);
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		ob.sub(input2,input3);
	}


}
