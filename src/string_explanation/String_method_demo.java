package string_explanation;

public class String_method_demo {

	public static void getdata()
	{
		String s=" naveen ji ";
		String a="MONTU";
		String s1="een";
	     boolean	out=s.equals(s1);
		System.out.println("1."+out);
		
		System.out.println("2."+s.equalsIgnoreCase(s1));
		
		System.out.println("3."+s.contains(s1));
		
		System.out.println("4."+s.charAt(5));
		
		System.out.println("5."+s.length());
		
	    System.out.println("6."+s.substring(2));
	 
		System.out.println("7."+s.substring(1,3 ));
		
		System.out.println("8."+s.replace("naveen","montu"));
		
		System.out.println("9."+s.toUpperCase());
		
		System.out.println("10."+a.toLowerCase());
		
		System.out.println("11."+s.trim());
		
	}
	
	public static void main(String[] args) {
		getdata();
	}
}
