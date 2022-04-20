package polymorphism;

public class Overloading_Demo {
	
	public int addition(int a, int b)
	{
		return a+b;
		
	}
	public int addition(int a, int b,int c)
	{
		return a+b+c;
		
	}
	public int addition(int a, int b,int c,int d)
	{
		return a+b+c+d;
		
	}
	public int addition(int a, int b,int c,int d,int e)
	{
		return a+b+c+d+e;
		
	}

	
	public static void main(String[] args) {
		Overloading_Demo ob=new Overloading_Demo();
		int out =ob.addition(12,23,13,45);
		System.out.println(out);
	}
}
