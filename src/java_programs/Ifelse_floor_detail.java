package java_programs;

import java.util.Scanner;

public class Ifelse_floor_detail {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the room no.");
		int a=sc.nextInt();
		if (a>0&&a<=10) {
		System.out.println("Room is in first floor");	
		}
		else if(a>10&&a<=20) {
			System.out.println("Room is in second floor");
		}
		else
		{
			System.out.println("Room no. is not valid");
		}
	}
}
