package inheritance_practice;

class Xyx
{
	public void getdata() {
		System.out.println("frome xyz class");
	}
}
class Pqr extends Xyx
{
	public void showdata() {
		System.out.println("from PQR class");
	}
}
public class Multilevel_inheritance extends Pqr {
	public void displaydata() {
		System.out.println("Frome multilevel inhertance class");
	}

	
	public static void main(String[] args) {
		Multilevel_inheritance ob=new Multilevel_inheritance();
		ob.getdata();
		ob.showdata();
		ob.displaydata();
	}
}
