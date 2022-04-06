package java_programs;

import java.util.Scanner;

public class Marksheet {
	
	public void getdetail(String name, String fathername, long rollno ,int hindimarks,int mathsmarks,int sciencemarks,int sstmarks,int englishmarks)
	{
		System.out.println("*****MARKSHEET*****");
		System.err.println();
		System.out.println("student anem  "+name);
		System.out.println("father name "+fathername);
		System.out.println("rollno "+rollno);
		System.out.println("Hindi marks is    "+hindimarks);
		System.out.println("English marks is  "+englishmarks);
		System.out.println("Maths marks is    "+mathsmarks);
		System.out.println("Science marks is  "+sciencemarks);
		System.out.println("S.St marks is     "+sstmarks);
		
		String resultstatus=getvalidateresult(hindimarks, mathsmarks, sciencemarks, sstmarks, englishmarks);
		System.out.println("Your result is    "+resultstatus);
		if(resultstatus.equals("pass"))
		{
			int total=hindimarks+englishmarks+mathsmarks+sciencemarks+sstmarks;
			System.out.println("Your total marks is  "+  total);
			int percent=(total*100)/500;
			if(percent>=33&&percent<45)
			{
				System.out.println("Your are pass with IIIrd division");
			}
			else if(percent>=45&&percent<60)
			{
				System.out.println(" Your are pass with IInd division");
			}
			else
			{
				System.out.println("You are pass with first division");
			}
		}
		}
	public String getvalidateresult(int hindimarks,int mathsmarks,int sciencemarks,int sstmarks,int englishmarks)
	{
		String result="pass";
		if(mathsmarks<33||hindimarks<33||englishmarks<33||sciencemarks<33||sstmarks<33)
		{
			result="fail";
			
		}
		return result;
		
	}
	public static void main(String[] args) {
		
		Marksheet ob=new Marksheet();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the student name");
		String name=sc.next();
		System.out.println("Please enter the father name");
		 String fathername=sc.next();
		 System.out.println("please enter the rollno");
		 long rollno=sc.nextLong();
		System.out.println("Please enter the Hindimarks");
		int hindi=sc.nextInt();
		System.out.println("Please enter the Englishmarks");
		int english=sc.nextInt();
		System.out.println("Please enter the Mathsmarks");
		int maths=sc.nextInt();
		System.out.println("Please enter the Sciencemarks");
		int science=sc.nextInt();
		System.out.println("Please enter the sstmarks");
		int sst=sc.nextInt();
		ob.getdetail(name, fathername, rollno, hindi, maths, science, sst, english);
		ob.getvalidateresult(hindi, maths, science, sst, english);
	}

}
