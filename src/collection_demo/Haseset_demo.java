package collection_demo;

import java.util.HashSet;

public class Haseset_demo {
	
	public static void getdata()
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("montu");
		hs.add("naveen");
		hs.add("rohit");
		hs.add("montu");
		hs.add("rahit");
		for(String dd:hs)
		{
			System.out.println(dd);
		}
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
