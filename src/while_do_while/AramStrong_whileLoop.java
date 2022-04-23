package while_do_while;

public class AramStrong_whileLoop {
	public static void getdata(int num) {
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			num=num/10;
			sum=sum+(a*a*a);
		}
		if(temp==sum)
		{
			System.out.println("This is armstrong");
		}
		else
		{
			System.out.println("This number is not armstrong");
		}
		
	}

	
	public static void main(String[] args) {
		getdata(153);
	}
}
