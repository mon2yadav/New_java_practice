package array_programs;

import java.util.Scanner;

public class ArrayAdditionDemo {
	
	public int[] getaddition(int a[], int b[])
	{
		int []c=new int[a.length];
		for(int k=0; k<=c.length-1; k++)
		{
			c[k]=a[k]+b[k];
		}
		return c;
	}
	public static void main(String[] args) {
		ArrayAdditionDemo ob=new ArrayAdditionDemo();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the size ");
			int size =sc.nextInt();
			int []a=new int[size];
			System.out.println("Please enter the first array numbers ");
			for(int i=0;i<=a.length-1; i++)
			{
				a[i]=sc.nextInt();
			}
			int []b=new int[size];
//		int size1=sc.nextInt();
			System.out.println("please enter the second array number");
			for(int j=0; j<=b.length-1; j++)
			{
				b[j]=sc.nextInt();
			}
			System.out.println("sum of arrays");
			int c[]=ob.getaddition(a, b);
			for(int k=0; k<=c.length-1; k++)
			{
				System.out.println(c[k]);
			}
		}
		
	}

}
