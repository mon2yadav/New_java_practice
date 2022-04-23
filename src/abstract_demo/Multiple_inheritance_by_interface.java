package abstract_demo;

interface ABCD
{
	public void showdata();
}
interface PQRS
{
	public void getdata();
}
interface WXYZ
{
	public void printdata();
}

public class Multiple_inheritance_by_interface implements ABCD,PQRS,WXYZ {
	
	

	@Override
	public void printdata() {
		System.out.println("hello print data");
		
	}

	@Override
	public void getdata() {
		System.out.println("Hello getdata ");
		
	}

	@Override
	public void showdata() {
		System.out.println("Hello show data");
		
	}
public static void main(String[] args) {
	Multiple_inheritance_by_interface ob=new Multiple_inheritance_by_interface();
	ob.printdata();
	ob.getdata();
	ob.showdata();
	}

}
