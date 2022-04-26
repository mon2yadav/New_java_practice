package collection_demo;

import java.util.ArrayList;

public class ArrayList_demo {
	
	public static void showdata() {
		ArrayList list=new ArrayList();
		list.add("montu");
		list.add(12345);
		list.add(1.45);
		list.add('A');
		list.add("naveen");
		for(Object dd:list)
		{
			System.out.println(dd);
		}
		
	}
	
	
	public static void main(String[] args) {
		showdata();
	}

}
