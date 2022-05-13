package static_veriable_demo;

class student_client
{
	String name;
	int rollno;
	static String collagename="ABES";
	String course;
	public student_client(String name, int rollno, String course) {
		this.name=name;
		this.rollno=rollno;
		this.course=course;
		
	}
	public static void valuechage() {
		collagename="KITE";
	}
	
	public void display() {
		System.out.println(name + " " + rollno + " " + course + " " + collagename);
	}
}

public class Practise_for_static_veriable_and_method {
	
	public static void main(String[] args) {
		student_client.valuechage();
		student_client ob=new student_client("naveen",123,"btech");
		student_client ob1=new student_client("montu",1234,"diploma");
		student_client ob2=new student_client("Pinki",1235,"MCA");
		student_client ob3=new student_client("Neha",1236,"Mtech");
	ob.display();
	ob1.display();
	ob2.display();
	ob3.display();
		
	}

}
