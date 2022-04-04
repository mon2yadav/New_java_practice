package java_programs;

import java.util.Scanner;

public class Addition_returnType {

	public int addtion(int a, int b) // return type and parametrized
	{
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		Addition_returnType ob = new Addition_returnType();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two input for add");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int out = ob.addtion(a, b);
		System.out.println(out);

	}
}
