package collection_demo;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList_demo {
	
	public static void getdata() {
		LinkedList<String> li=new LinkedList<String>();
		li.add("montu");
		li.add("naveen");
		li.add(0,"ravi");
		li.add(1,"vinay");
		Iterator<String> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	
	public static void main(String[] args) {
		getdata();
	}
}
