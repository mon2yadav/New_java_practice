package collection_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Itrator_demo {
	
	public static void  getdata() {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(12);
		li.add(23);
		li.add(45);
		li.add(65);
		li.add(56);
		Iterator<Integer> itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();  
		}
		
		
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
