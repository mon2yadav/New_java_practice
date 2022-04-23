package exception_handling;

import java.util.InputMismatchException;

public class Throws_demoException {
	
	public void showdata() throws InterruptedException,ArithmeticException,InputMismatchException
	{
		int a=20;
		System.out.println(a);
		Thread.sleep(5000);
		System.out.println("Hello thorws demo");
	}

	
	public static void main(String[] args) throws InputMismatchException, ArithmeticException, InterruptedException {
		Throws_demoException ob=new Throws_demoException();
		ob.showdata();
	}
}
