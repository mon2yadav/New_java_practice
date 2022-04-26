package collection_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_compare_integer {
	
	public static void showdata(ArrayList<Integer> li, ArrayList<Integer> li1)
	{
		for(Integer dd:li)
		{
			for(Integer dd1:li1)
			{
				if(dd==dd1)
				{
					System.out.println(dd+" is matched "+(dd+dd1));
				}
				li1.remove(dd1);
				break;
				
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		ArrayList<Integer> li1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 Integer");
		for(int i=0; i<=4; i++)
		{
			li.add(sc.nextInt());
		}
		System.out.println("Please enter 5 another integer for compare");
		for(int j=0; j<=4; j++)
		{
			li1.add(sc.nextInt());
		}
		showdata(li,li1);
		
		
	}

}
