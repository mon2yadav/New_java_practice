package string_explanation;

public class String_byliteral_bynew {
	
	public static void getdata()
	{
		String s="hello";   // by literal
		String s1="hello";   // by literal    memory is created in Pool
		String s2=new String("hello");    // by new keyword
		String s3=new String("hello");    // by new keyword   memory is created in heap
		if(s==s1) {
			System.out.println(true);
			
		}
		else
		{
			System.out.println(false);
		}
		if(s1==s2) {
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		if(s2==s3) {
			System.out.println(true);
		}
		else
		{
		System.out.println(false);
		}
	}
	
	public static void main(String[] args) {
		getdata();
	}

}
