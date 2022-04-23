package abstract_demo;

 abstract class RBI
{
	abstract public  int ROI();
	public float raporate() {
		return 0.4f;
		
	}
	
}
 
 class axixabank extends RBI
 {

	@Override
	public int ROI() {
		return 10;
		
		
	}
	 
 }

public class Abstract_demo1 {
	public static void main(String[] args) {
		axixabank ob=new axixabank();
		System.out.println(ob.ROI());
		System.out.println(ob.raporate());
	}
	
}
