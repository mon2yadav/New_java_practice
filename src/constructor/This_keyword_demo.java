package constructor;

public class This_keyword_demo {
	int a;
public This_keyword_demo(int a) {
	this.a=a;
	
}
public void showdata() {
	System.out.println(a);
}
	
	public static void main(String[] args) {
		This_keyword_demo ob=new This_keyword_demo(15);
		ob.showdata();
		
	}
}
