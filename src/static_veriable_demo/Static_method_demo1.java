package static_veriable_demo;

class student_clint
{
	String name;
	int rollnumber;
	String course;
	static String collagename="ABES";
	public student_clint(String name,int rollnumber,String course) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.course=course;
		
	}
	public static void changevalue() {
		collagename="Ambedkar polytechnic";
		
	}
	public void display() {
		System.out.println(name+" "+rollnumber+" "+course+" "+collagename+" ");
	}
}

public class Static_method_demo1 {
	
	public static void main(String[] args) {
		student_clint.changevalue(); 
		student_clint ob=new student_clint("montu",123,"diploma");
		student_clint ob1=new student_clint("naveen",1234,"b.tech");
		student_clint ob2=new student_clint("Neha",1235,"MCA");
		student_clint ob3=new student_clint("Rinki",1236,"M.A");
		ob.display();
		ob1.display();
		ob2.display();
		ob3.display();
		
		
	}

}
