package array_programs;

import java.util.Scanner;

public class Compare_reverseString {

	public void getdata(String input,String word) {

		String[] str = input.split(" ");
            
		String out = "";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(word)) {
				char[] c = word.toCharArray();
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
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the sentence");
			String data = sc.nextLine();
			System.out.println("Please enter the word for match");
			String word=sc.next();
			ob.getdata(data, word);
		}

	}
}
