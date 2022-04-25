package string_explanation;

public class String_buffer_demo {

	public static  void getdata() {
		String a="hello";
	      String out=a.replace("ll","o");
	     System.out.println(out);
	     System.out.println(a);
	     StringBuffer sb=new StringBuffer("kalpan");
	     StringBuffer out1=sb.insert(6," bisth");
	     System.out.println(out1);
	     System.out.println(sb);
	}
	
	public static void main(String[] args) {
		getdata();
	}
}
