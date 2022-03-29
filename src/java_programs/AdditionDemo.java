
package java_programs;

public class AdditionDemo {
	


	public static void main(String[] args) {
		int a, b, c, d, e, f;
		try {
			a = 34;
			b = 32;
			c = a + b;
			System.out.println("addition");
			System.out.println(c);

			a = 34;
			b = 2;
			c = a * b;
			System.out.println("multiplicaiton");
			System.out.println(c);

			d = 54;
			e = 2;
			f = d / e;
			System.out.println("division");
			System.out.println(f);
			
			a=56;
			b=12;
			c=a-b;
			System.out.println("subtraction");
			System.out.println(c);

		} catch (Exception e1) {
			System.out.println("issue in get addition   " + e1);
		}

	}

}
