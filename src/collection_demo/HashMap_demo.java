package collection_demo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_demo {
	
	public static void getdata() {
		try {
			HashMap<Integer,String> map=new HashMap<Integer, String>();
			map.put(1, "montu");
			map.put(3, "rohit");
			map.put(4, "montu");
			map.put(5, "ashok");
			Set<Entry<Integer, String>> set = map.entrySet();
			for( Entry<Integer,String> dd:set)
			{
				System.out.println(dd.getKey()+" "+dd.getValue());
			}
			
		} catch (Exception e) {
			System.out.println(" issue in get data  "+e);
		}
		
		
	}

	
	public static void main(String[] args) {
		getdata();
	}
}
