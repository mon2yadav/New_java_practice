package inheritance_practice;


class LMN
{
	public void A() {
		System.out.println("from LMN class");
	}
}
class RRR extends LMN
{
	public void B() {
		System.out.println("from RRR class");
	}
}
public class Hirarical_inheritance_demo extends LMN {
	public void C() {
		System.out.println("from hirarichal demo");
	}

	public static void main(String[] args) {
		Hirarical_inheritance_demo ob=new Hirarical_inheritance_demo();
		ob.A();
		ob.C();
		RRR ob1=new RRR();
		ob1.B();
		ob1.A();
		
	}
}
