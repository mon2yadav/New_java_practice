package java_programs;

import java.util.Scanner;

public class Marksheet_practise {
	
	public void getdetatil(String name, String fatherName, String Class, int rollnumber, int hindimarks, int englishmarks,
			int mathsmarks, int sciencemarks, int SStmarks)
	{
		System.out.println("*****MARKSHEET***BY***CBSE***BOARD****");
		System.out.println();
		System.out.println("Student name is          "+name);
		System.out.println("Student father name is   "+fatherName);
		System.out.println("Class is                 "+Class);
		System.out.println("Roll number is           "+rollnumber);
		System.out.println("Hindi marks is           "+hindimarks);
		System.out.println("English marks is         "+englishmarks);
		System.out.println("Maths marks is           "+mathsmarks);
		System.out.println("Science marks is         "+sciencemarks);
		System.out.println("SSt marks is             "+SStmarks);
		String resultStatus=getvalidateresult(hindimarks, englishmarks, mathsmarks, sciencemarks, SStmarks);
		System.out.println("Your result is   "+resultStatus);
		if(resultStatus.equals("pass"))
		{
			int total=hindimarks+englishmarks+mathsmarks+sciencemarks+SStmarks;
			float percent=(total*100)/500;
			if(percent>=33 && percent<45)
			{
				System.out.println("You are passed with Third division ");
			}
			else if(percent>=45  && percent<60)
			{
				System.out.println("You are passed with Second division ");
			}
			else if(percent >=60 && percent<85 )
			{
				System.out.println("You are passed with Ist division");
			}
			else
			{
				System.out.println("You are the Bright student ");
			}
			System.out.println("Your percentage is   "+percent);
		}
		
	}
	
	public String getvalidateresult(int hindimarks, int englishmarks, int mathsmarks, int sciencemarks, int SStmarks)
	{
		String result="pass";
		if(hindimarks<33||englishmarks<33||mathsmarks<33||sciencemarks<33||SStmarks<33)
		{
		  result="fail";	
		}
		return result;
	}
	
	public static void main(String[] args) {
		Marksheet_practise ob=new Marksheet_practise();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your father name");
		String fathername=sc.next();
		System.out.println("Enter your class");
		String Class=sc.next();
		System.out.println("Enter your roll number");
		int rollnumber=sc.nextInt();
		
		System.out.println(" Enter your hindimarks");
		int hindimarks =sc.nextInt();
		System.out.println(" Enter your englishmarks");
		int englishmarks =sc.nextInt();
		System.out.println(" Enter your mathsmarks");
		int mathsmarks =sc.nextInt();
		System.out.println(" Enter your sciencemarks");
		int sciencemarks =sc.nextInt();
		System.out.println(" Enter your SStmarks");
		int SStmarks =sc.nextInt();
		ob.getdetatil(name, fathername, Class, rollnumber, hindimarks, englishmarks, mathsmarks, sciencemarks, SStmarks);
	}

}
