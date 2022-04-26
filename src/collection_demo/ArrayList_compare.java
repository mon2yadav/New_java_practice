package collection_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_compare {
	
	public static void getdata(ArrayList<String> li,ArrayList<String> li1)
	{
		for(String dd:li)
		{
			for(String dd1:li1)
			{
				if(dd.equals(dd1))
				{
					System.out.println(dd+" is matched");
				}
				li1.remove(dd1);
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<String> li=new ArrayList<String>();
		ArrayList<String> li1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the 5 input");
		for(int i=0; i<=4; i++)
		{
			li.add(sc.next());
		}
		System.out.println("Please enter another 5 inputs");
		for(int k=0; k<=4; k++)
		{
			li1.add(sc.next());
		}
		getdata(li,li1);
		
		
	}

}
