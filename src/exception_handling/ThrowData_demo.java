package exception_handling;

public class ThrowData_demo {
	
	public void getdata(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is less than 18");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}
	}

	
	public static void main(String[] args) {
		ThrowData_demo ob=new ThrowData_demo();
		ob.getdata(19);
	}
}
