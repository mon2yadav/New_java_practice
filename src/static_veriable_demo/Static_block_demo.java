package static_veriable_demo;

public class Static_block_demo {
	static int a=0;
	public Static_block_demo() {
		a++;
	System.out.println(a);  
} 

	static
	{
		System.out.println("Hello static block");
	}
		
	public static void main(String[] args) {
		Static_block_demo ob=new Static_block_demo();
		Static_block_demo ob1=new Static_block_demo();
		Static_block_demo ob2=new Static_block_demo();
		System.out.println(" Hello main block");
	}
}
