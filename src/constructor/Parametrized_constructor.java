package constructor;

import java.util.Scanner;

public class Parametrized_constructor {

	public Parametrized_constructor(int a, int b) {
		System.out.println(a+b);
		
	}
	
	public void showdata(int a,int b) {
		int c=a+b;;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter two inputs");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Parametrized_constructor ob=new Parametrized_constructor(a,b);
		ob.showdata(a,b);
	}
}
