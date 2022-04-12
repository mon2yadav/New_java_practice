package array_programs;

import java.util.Scanner;

public class Compare_reverseString {

	public void getdata(String input) {

		String[] str = input.split(" ");
            
		String str1 = "your";
		String out = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(str1)) {
				char[] c = str1.toCharArray();
				for (int k = c.length - 1; k >= 0; k--) {
					out = out + c[k];
				}
				break;
			}
			if(str.length-1 == i)
			{
				System.out.println("wrong entity");
			}
			

			out = out + "";

		}
		

		System.out.println(out);
	
	}

	public static void main(String[] args) {
		Compare_reverseString ob = new Compare_reverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence");
		String data = sc.nextLine();
		ob.getdata(data);

	}
}
