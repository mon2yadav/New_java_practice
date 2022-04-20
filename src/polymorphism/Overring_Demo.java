package polymorphism;
 

class RBI
{
	public float ROI() {
		return 0;
		
	}
}
class axix extends RBI
{
	public float ROI() {
		return 10;
		
	}
}
class canara extends axix
{
	public float ROI() {
		return 12;
		
	}
}
public class Overring_Demo {

	
	public static void main(String[] args) {
		canara ob=new canara();
		float out=ob.ROI();
		System.out.println(out);
				
	}
}
