package arraylist;

import java.util.ArrayList;

public class ArrayList_comparision {
	
	public static void getdata() {
		ArrayList<String> name1=new ArrayList<String>();
		ArrayList<String> name2=new ArrayList<String>();
		name1.add("montu");
		name1.add("naveen");
		name1.add("neha");
		name2.add("montu1");
		name2.add("naveen");
		name2.add("neha");
		for(String dd:name1)
		{
			for(String dd1:name2)
			{
				if(dd.equalsIgnoreCase(dd1))
				{
					System.out.println(dd+" is matched ");
				}
				else
				{
					System.out.println(dd+ " is not matched");
				}
				name2.remove(dd1);
				break;
				
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
	getdata();	
	}

}
