package string_explanation;

public class String_Buffer_demo_method {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("montudemo");
		System.out.println(sb.capacity());
//		System.out.println(sb.delete(4, 8));
		System.out.println(sb.deleteCharAt(3));
//		System.out.println(sb.reverse());
		StringBuffer out=sb.reverse();
		System.out.println(out);
		
		StringBuilder sf=new StringBuilder("Naveen");
//		StringBuilder out1=sf.reverse(); 
		System.out.println(sf.insert(6, " ji"));
//		System.out.println(out1);
		
		
		
	}

}
