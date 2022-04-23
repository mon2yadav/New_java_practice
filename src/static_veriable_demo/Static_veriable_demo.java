package static_veriable_demo;

public class Static_veriable_demo {
	 static  int a=0;
	public Static_veriable_demo() {
		a++;
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		Static_veriable_demo ob=new Static_veriable_demo();
		Static_veriable_demo ob1=new Static_veriable_demo();
		Static_veriable_demo ob2=new Static_veriable_demo();
	}
}
