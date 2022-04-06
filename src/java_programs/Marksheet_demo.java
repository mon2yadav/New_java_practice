package java_programs;

import java.util.Scanner;

public class Marksheet_demo {
	
	public void getdetail(String name, String fathername , long rollno, String branch,
			int hindimarks,int englishmarks, int mathsmarks, int sciencemarks, int sstmarks) 
	{
		
		System.out.println("*****MARKSHEET*****");
		System.err.println();
		System.out.println("student name is      "+name);
		System.out.println("father name is       "+fathername);
		System.out.println("Roll no. is          "+rollno);
		System.out.println("Branch is            "+branch);
		System.out.println();
		System.out.println("Hindi marks is       "+hindimarks);
		System.out.println("English marks is     "+englishmarks);
		System.out.println("Maths marks is       "+mathsmarks);
		System.out.println("Science marks is     "+sciencemarks);
		System.out.println("sst marks is         "+sstmarks);
		String resultstatus=getvalidateresult(hindimarks, englishmarks, mathsmarks, sciencemarks, sstmarks);
		System.out.println("Your result is       "+resultstatus);
		System.out.println();
		if(resultstatus.equals("pass"))
		{
			int total=hindimarks+englishmarks+mathsmarks+sciencemarks+sstmarks;
			System.out.println("Your total marks is   "+total);
			int percent=(total*100)/500;
			if(percent>=33&&percent<45)
			{
				System.out.println("You are passed with IIIrd division");
			}
			else if(percent>=45&&percent<60)
			{
				System.out.println("You are passed with IInd division");
				
			}
			else
			{
				System.out.println("you are passed with Ist division");
			}
		}
	}
	
	public String getvalidateresult(int hindimarks,int englishmarks,int mathsmarks,int sciencemarks,int sstmarks)
	{
		String result="pass";
		if(hindimarks<33||englishmarks<33||mathsmarks<33||sciencemarks<33||sstmarks<33)
		{
			 result="fail";
		}
		return result;
		
	}
	public static void main(String[] args) {
		Marksheet_demo ob=new Marksheet_demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the student name");
		String sname=sc.next();
		System.out.println("Please enter the father name");
		String fname=sc.next();
		System.out.println("Please enter the rollno");
		long rollno=sc.nextLong();
		System.out.println("Please enter your branch");
		String branch=sc.next();
		System.out.println("Please enter your hindimarks");
		int hindimarks=sc.nextInt();
		System.out.println("Please enter your englishmarks");
		int englishmarks=sc.nextInt();
		System.out.println("Please enter your mathsmarks");
		int mathsmarks=sc.nextInt();
		System.out.println("Please enter your sciencemarks");
		int sciencemarks=sc.nextInt();
		System.out.println("Please enter your sstmarks");
		int sstmarks=sc.nextInt();
		ob.getdetail(sname, fname, rollno, branch, hindimarks, englishmarks, mathsmarks, sciencemarks, sstmarks);
		ob.getvalidateresult(hindimarks, englishmarks, mathsmarks, sciencemarks, sstmarks);
		
	}

}
