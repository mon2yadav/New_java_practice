package abstract_demo;

abstract class car {
	abstract public int seat();

	abstract public String colour();

	public int wheel() {
		return 4;
	}
}
class maruti extends car {

	public int seat() {
     return 7;
	}
 public String colour() {

		return "Yellow";
	}
 }
class hyundai extends car {

	@Override
	public int seat() {
    return 5;
	}

	@Override
	public String colour() {

		return "RED";
	}

}

public class Abstract_class_demo {

	public static void main(String[] args) {
		maruti ob = new maruti();
		System.out.println(ob.seat());
		System.out.println(ob.colour());
		System.out.println(ob.wheel());

		hyundai ob1 = new hyundai();

		System.out.println(ob1.seat());
		System.out.println(ob1.colour());
		System.out.println(ob1.wheel());

	}

}
