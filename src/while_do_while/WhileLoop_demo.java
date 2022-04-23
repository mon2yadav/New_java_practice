package while_do_while;

public class WhileLoop_demo {
	public static void getdata(int num) {
		int i=1;
		
		while(i<=10) {
			int out=num*i;
			System.out.println(out);
			i++;
		}
	}
public static void main(String[] args) {
	getdata(2434);
}
}
