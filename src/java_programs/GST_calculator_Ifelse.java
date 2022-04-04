package java_programs;

import java.util.Scanner;

public class GST_calculator_Ifelse {
	
	public void getgst(float amount)
	{
		float gst=0;
		if(amount<1000)
		{
			gst=(amount*5)/100;
		}
		else if(amount>1000&&amount<=5000)
		{	
			gst=(amount*10)/100;
		}
		else
		{
			gst=(amount*18)/100;
		}
		System.out.println(gst);
	}

	
	public static void main(String[] args) {
		
		 GST_calculator_Ifelse ob=new  GST_calculator_Ifelse();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Please enter the amount");
	      float amount=sc.nextFloat();
	      ob.getgst(amount);
	}
}
