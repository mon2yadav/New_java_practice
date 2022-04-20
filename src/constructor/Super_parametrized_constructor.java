package constructor;

class javademo
{
	public javademo(int a) {
		System.out.println("hello java demo  "+a);
	}
}

public class Super_parametrized_constructor extends javademo {
public Super_parametrized_constructor() {
	super(10);
	System.out.println(" parameterized constructor");
}
	
	public static void main(String[] args) {
		Super_parametrized_constructor ob=new Super_parametrized_constructor();
	}
}
