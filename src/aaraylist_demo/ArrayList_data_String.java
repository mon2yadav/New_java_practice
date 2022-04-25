package aaraylist_demo;

import java.util.ArrayList;

public class ArrayList_data_String {
	
	public static void getdata() {
		ArrayList<String> list=new ArrayList<String>();
		list.add("montu");
		list.add("naveen");
		list.add("neha");
		list.add("rohit");
		list.add("saddam");
		for(String dd:list)
		{
			System.out.println(dd);
		}
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(123);
		list1.add(234);
		list1.add(432);
		list1.add(567);
		for(Integer dd:list1)
		{
			System.out.println(dd);
		}
		
		
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
