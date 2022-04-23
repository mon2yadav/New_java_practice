package static_veriable_demo;

public class Static_block_demo {
	public Static_block_demo() {
		int a=2;
	System.out.println(a);
} 

	static
	{
		System.out.println("Hello static block");
	}
		
	public static void main(String[] args) {
		Static_block_demo ob=new Static_block_demo();
		System.out.println(" Hello main block");
	}
}
