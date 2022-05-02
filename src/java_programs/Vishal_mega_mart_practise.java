package java_programs;

import java.util.Scanner;

public class Vishal_mega_mart_practise {
	
	public void getdetail(String name, String productName, float price, long mobile)
	{
		System.out.println("*****VISHAL MEGA MART*****");
		System.out.println();
		System.out.println("Customeer name is         "    +           name);
		System.out.println("Mobile number is          "    +           mobile);
		System.out.println("Product name is           "      +           productName);
		System.out.println("Price is                  "             +           price);
		float outgst=GSTcalculate(price);
		System.out.println("Your gst is               "          +           outgst);
		float totalamount=outgst+price;
		System.out.println("Your payble amount is     " +           totalamount);
	}
	
	public float GSTcalculate(float price)
	{
		float GST=0;
		if(price<500)
		{
			GST=(price*5)/100;
		}
		else if(price>=500 && price <=1000)
		{
			GST=(price*10)/100;
		}
		else
		{
			GST=(price*18)/100;
		}
		
		return GST;
		
	}
	
	public static void main(String[] args) {
		Vishal_mega_mart_practise ob=new Vishal_mega_mart_practise();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your mibile number");
		long mobile=sc.nextLong();
		System.out.println("Enter the product name");
		String productName=sc.next();
		System.out.println("Enter the price");
		float price=sc.nextFloat();
		System.out.println();
		ob.getdetail(name, productName,price,mobile);
		
		
	}

}
