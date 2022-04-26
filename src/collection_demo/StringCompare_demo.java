package collection_demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class StringCompare_demo {
	
	public static void getdata(ArrayList<String> li, ArrayList<String> li1)
	{
//		Iterator<String> itr=li.iterator();
//		Iterator<String> itr1=li1.iterator();
//		while(itr.hasNext())
//		{
//			
//			while(itr1.hasNext())
//			{
//				 String out=itr.next();
//				String out1=itr1.next();
//				if(out.equals(out1))
//				{
//					System.out.println(out+" is matched");
//					break;
//				}
//			}
//		}
		for(String dd:li)
		{
			boolean status=false;
			for(String dd1:li1)
			{
				if(dd.equals(dd1))
				{
					System.out.println(dd+" is matched");
					status= true;
					break;
				}
			}
			if(status==false)
			{
				System.out.println(dd+" is not matched");
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> li=new ArrayList<String>();
		ArrayList<String> li1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter 5 String");
		for(int i=0; i<=4; i++)
		{
			li.add(sc.next());
		}
		System.out.println("Enter another 5 String for compare");
		for(int j=0; j<=4; j++)
		{
			li1.add(sc.next());
		}
		getdata(li,li1);
		
	}

}
