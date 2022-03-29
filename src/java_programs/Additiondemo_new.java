package java_programs;

public class Additiondemo_new 
{
	int a,b,c,d,e,f,g;
	public void addition()      //non return type due to void
	{
		 a=76;
		 b=56;
		 c=a+b;
		System.out.println(c);
		
	}
	
	public void subtraction()
	{
		a=40;
		b=34;
		d=a-b;
		System.out.println(d);		
		
	}
	public void multiplication() 
	{
		e=23;
		f=20;
		g=e*f;
		System.out.println(g);
	}
	
	public void division() 
	{
		a=54;
		b=27;
		c=a/b;
		System.out.println(c);
		
	}
	public static void main(String[] args)
	{
		Additiondemo_new ob =new Additiondemo_new();    // object creation object always in main method 
		ob.addition();                                    // we can not call any method without create the object
		ob.subtraction();
		ob.multiplication();
		ob.division();
		            
	}

}
