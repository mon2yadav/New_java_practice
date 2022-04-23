package abstract_demo;

interface ABC
{
	public void showdata();
	public void printdata();
}

public class Interface_demo implements ABC {

	
		
	

	@Override
	public void showdata() {
		System.out.println(" hello showdata");
		
	}

	@Override
	public void printdata() {
		
		System.out.println(" hello print data");
	}
	public static void main(String[] args) {
		Interface_demo ob=new Interface_demo();
		ob.showdata();
		ob.printdata();
	}
}
