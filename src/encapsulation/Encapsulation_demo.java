package encapsulation;

public class Encapsulation_demo {

	
	public static void main(String[] args) {
		Beanclass_demo ob=new Beanclass_demo();
		ob.setEmpname("montu");
		ob.setEmpdesignation("software Tester");
		ob.setEmpsallery(50000);
		ob.setCompany("medGrids");
		System.out.println(" Name is "+ob.getEmpname()+" Designation is "+ob.getEmpdesignation()+
				" Sallery is "+ob.getEmpsallery()+" company is " +ob.getCompany()+"");
	}
}
