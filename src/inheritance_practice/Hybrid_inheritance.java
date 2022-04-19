package inheritance_practice;

class AA
{
	public void getdata() {
		System.out.println("from class AA");
	}
}
class BB extends AA
{
	public void showdata() {
		System.out.println("from class BB");
	}
}
class CC extends AA
{
	public void printdata() {
		System.out.println("from class CC");
	}
}

public class Hybrid_inheritance extends CC {
	
	public void displaudata() {
		System.out.println("from hybrid inheritance");
	}

	
	public static void main(String[] args) {
		Hybrid_inheritance ob=new Hybrid_inheritance();
		ob.displaudata();
		ob.printdata();
		ob.getdata();
		BB ob1=new BB();
		ob1.showdata();
		ob1.getdata();
	}
}
