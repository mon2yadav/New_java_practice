package constructor;

public class Constructor_Demo {

	public Constructor_Demo()                 //Default Constructor 
	{
		int a=12;
		System.out.println(a);
	}
	public void getdata() {
		int b=14;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Constructor_Demo ob=new Constructor_Demo();
		ob.getdata();
	}
}
