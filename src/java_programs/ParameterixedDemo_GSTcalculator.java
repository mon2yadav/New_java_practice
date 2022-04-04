package java_programs;

import java.util.Scanner;

public class ParameterixedDemo_GSTcalculator {

	public void GSTcalculator(float amount) {

		float c = (amount * 18) / 100;
		System.out.println(c);
	}

	public static void main(String[] args) {

		ParameterixedDemo_GSTcalculator ob = new ParameterixedDemo_GSTcalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount");
		float amount = sc.nextFloat();

		ob.GSTcalculator(amount);
	}
}
