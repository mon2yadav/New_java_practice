package static_veriable_demo;

class AAAA{
	
	static int b=2;
	public static void getdata() {
		System.out.println(" hello getdata  "+b);
	}
	
}

public class Static_method_demo {
	 static int a=10;
	public static void showdata() {
		
		System.out.println(" Hello static method data  "+a);
	}
	
	public void displaydata() {
		System.out.println("Hello naveen");
	}

	
	public static void main(String[] args) {
		showdata();
		AAAA.getdata();
		Static_method_demo ob=new Static_method_demo();
		ob.displaydata();
	}
}
