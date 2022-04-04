package java_programs;

import java.util.Scanner;

public class Vishal_Mega_Mart_Demo {
	
	public void GetDetail(String name, String productname, long mobile, float price)
	
	{
		System.out.println("*****VISHAL MEGA MART*****");
		System.out.println();
		System.out.println("Customer  name ---  "+   name);
		System.out.println(" mobile no --- "+       mobile);
		System.out.println(" product name  ---"+    productname);
		System.out.println(" price  is --- "+       price);
		float outgst=GSTcalculate(price);
		System.out.println("Your gst is "+outgst);
		float totalamount=price+outgst;
		System.out.println("your payble amoutn  "+totalamount);
	}
	public float GSTcalculate(float price)
	{
		float gst;
		if(price<500)
		{
			gst=(price*5)/100;
		}
		else if(price>500&& price<=1000)
		{
			gst=(price*10)/100;
		}
		else 
		{
			gst=(price*18)/100;
		}
		return gst;
	}

	
	
	public static void main(String[] args) {
		Vishal_Mega_Mart_Demo ob=new Vishal_Mega_Mart_Demo();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=sc.next();
		System.out.println(" Enter your mobile no.");
		long mobile=sc.nextLong();
		System.out.println("Enter the product name");
		String productname=sc.next();
		System.out.println("Enter the price of the product");
		float price=sc.nextFloat();
		ob.GetDetail(name, productname, mobile, price);
		
	}
}
