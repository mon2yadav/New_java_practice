package exception_handling;

public class Finally_exception_demo {
	
	public void showdata()
	{
		try {
//			int b=10/0;             // arithmetic exception
			
//			String O=123;             //input mismatch exception
//			int a=10/10;
//			String k="123";
			
			
//			String s=null;
//			System.out.println(s.length());     // null pointer exception 
			
			
//			int out=Integer.parseInt(/
			
//			String M="naveen";
//			int out1=Integer.parseInt(M);      // number format exception
//			System.out.println(out1);
			
			int c[]=new int[5];                  // arrayindex out of bounds exception
			c[6]=67;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" issue in showdata  "+e);
		}
		finally
		{
			System.out.println("Hello finally demo class ");
		}
		
	}
	

	
	public static void main(String[] args) {
		Finally_exception_demo ob=new Finally_exception_demo();
		ob.showdata();
		
	}
}
