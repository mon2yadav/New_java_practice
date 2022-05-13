package abstract_demo;

abstract class car {
	abstract int seat();

	abstract String colour();

	public int wheel() {
		return 4;

	}
}

class maruti extends car {

	@Override
	int seat() {

		return 4;
	}

	@Override
	String colour() {

		return "red";
	}

}

class hyndai extends car {

	@Override
	int seat() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	String colour() {
		// TODO Auto-generated method stub
		return "blue";
	}

}

class KIA extends car {

	@Override
	int seat() {

		return 5;
	}

	@Override
	String colour() {

		return "Black";
	}

}

public class Abstract_class_demo {

	public static void main(String[] args) {

		maruti ob = new maruti();

		System.out.println("seat " + ob.seat());
		System.out.println("colour " + ob.colour());
		System.out.println("wheel " + ob.wheel());
		System.out.println();
		hyndai ob1 = new hyndai();
		System.out.println("seat " + ob1.seat());
		System.out.println("colour " + ob1.colour());
		System.out.println("wheel " + ob1.wheel());
		System.out.println();
		KIA ob2 = new KIA();
		System.out.println("seat " + ob2.seat());
		System.out.println("colour " + ob2.colour());
		System.out.println("wheel " + ob2.wheel());

	}

}
