package exception_handling;

public class Exception_handling {
	
	public void getdata() {
		try {
			int a=10/0;
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Issue in show data  "+e);
		}
	}
	public void showdata() {
		System.out.println("method showdata");
	}
	public void printdata() {
		System.out.println("method printdata");
	}

	
	public static void main(String[] args) {
		Exception_handling ob=new Exception_handling();
		ob.getdata();
		ob.showdata();
		
		ob.printdata();
	}
}
