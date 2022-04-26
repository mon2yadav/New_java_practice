package collection_demo;

import java.util.HashSet;

public class Accurance_hashset_demo {
	
	public static void getdata(String input)
	{
		try {
			char[] arr=input.toCharArray();
			HashSet<Character> hs=new HashSet<Character>();
			for(int i=0; i<=arr.length-1; i++)
			{
				hs.add(arr[i]);
			}
			for(Character dd:hs)
			{
				int count=0;
				for(int i=0; i<=arr.length-1; i++)
				{
					if(dd==arr[i])
					{
						count++;
					}
				}
				System.out.println(dd + " char comes in "+count+" times");
			}
//			System.out.println(hs);
			
		} catch (Exception e) {
			System.out.println(" Issue in get dublicate value  "+e);
		}
	}
	
	public static void main(String[] args) {
		
		getdata("moontuyadav");
	}

}
