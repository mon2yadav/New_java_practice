package collection_demo;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_demo {

	public static void getdata() {
		TreeMap<Integer, String> tree=new TreeMap<Integer, String>();
		tree.put(2, "montu");
		tree.put(7, "naveen");
		tree.put(3, "vinod");
		tree.put(5, "Neha");
		tree.put(8, "montu");
		tree.put(1, "rohit");
		System.out.println(tree.descendingMap());
		System.out.println(tree.headMap(3));
		System.out.println(tree.tailMap(3));
		
		Set<Entry<Integer, String>> set = tree.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> data = itr.next();
			System.out.println(data.getKey()+" "+data.getValue());
		}
	}
	public static void main(String[] args) {
		getdata();
	}
}
