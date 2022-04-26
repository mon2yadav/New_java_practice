package collection_demo;

import java.util.Vector;

public class Vector_demo {
	
	public static void getdata() {
		Vector<String> ob=new Vector<String>();
		ob.add("naveen");
		ob.add("montu");
		ob.add("vinay");
		ob.addElement("horse");
		ob.addElement("elephant");
		System.out.println(ob);
		System.out.println(ob.firstElement());
		System.out.println(ob.lastElement());
		
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
