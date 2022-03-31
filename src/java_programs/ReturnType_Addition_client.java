package java_programs;

import java.util.Scanner;

public class ReturnType_Addition_client {

	
	
	public static void main(String[] args) {
		RetruType_Addition_server ob=new RetruType_Addition_server();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the two no. for add");
		int  a=sc.nextInt();
		int  b=sc.nextInt();
		
		ob.getaddition(a,b);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		ob.getsubtraction(a1, b1);
	}
}
