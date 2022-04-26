package collection_demo;

import java.util.LinkedHashSet;

public class Linked_hashset_demo {
	
	public static void showdata()
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("montu");
		lhs.add("rohit");
		lhs.add("vinay");
		lhs.add("rohit");
		lhs.add("vinay");
		lhs.add("abhishek");
		for(String dd:lhs)
		{
			System.out.println(dd);
		}
	}
	
	public static void main(String[] args) {
		showdata();	
	}

}
