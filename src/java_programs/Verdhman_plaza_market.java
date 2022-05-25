package java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Verdhman_plaza_market {
	
	public void getdetail(String name , String productname, long mobile, float price)
	{
		System.out.println("*****VERDHMAN***PLAZA***MARKET*****");
		System.out.println();
		System.out.println("Customer name is          "+   name);
		System.out.println("product name is           "+   productname);
		System.out.println("mobile numer is           "+   mobile);
		System.out.println("product price is          "+   price);
		float outgst = GSTcalculate(price);
		System.out.println("Your gst is               "+   outgst);
		float totalamount = price+outgst;
		System.out.println("your payable amount is    "+   totalamount);
	}
	public float GSTcalculate(float price)
	{
		float GST;
		if(price<500)
		{
			GST=(price*5)/100;
		}
		else if(price>500 && price<=1000)
		{
			GST=(price*10)/100;
		}
		else if(price>1000  &&  price<=5000)
		{
			GST=(price*12)/100;
		}
		else
		{
			GST=(price*18)/100;
		}
		return GST;
		
	}
	public static void main(String[] args) {
		Verdhman_plaza_market ob=new Verdhman_plaza_market();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your mobile number");
		long mobile = sc.nextLong();
		System.out.println("Enter your product name");
		
		String productname = sc.next();
		System.out.println("Enter your product price");
		float price = sc.nextFloat();
		ob.getdetail(name, productname, mobile, price);
	}

}
