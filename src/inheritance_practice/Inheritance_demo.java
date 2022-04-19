package inheritance_practice;

class AbcdDemo
{
	public void add()
	{
	System.out.println("hi");	
	}
}

public class Inheritance_demo  extends AbcdDemo{
	public void sub() {
		System.out.println(" hellow");
	}

	
	public static void main(String[] args) {
		Inheritance_demo ob=new Inheritance_demo();
		ob.sub();
		ob.add();
	}
}
