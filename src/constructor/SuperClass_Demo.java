package constructor;

class ABCD
{
	public void showdata() {
		System.out.println("data of ABCD");
	}
}

public class SuperClass_Demo extends ABCD {
	public void showdata() {
		super.showdata();
		System.out.println(" data of super class");
	}
	

	public static void main(String[] args) {
		SuperClass_Demo ob=new SuperClass_Demo();
		ob.showdata();
	}
}
