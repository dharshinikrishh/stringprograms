package programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				System.out.print("Enter string:");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1; i>=0;i--)
			rev =rev+str.charAt(i);
			if(str.equals(rev))
				System.out.println("String is palindrome");
			else
				System.out.println("String is not a palindrome");
				
	}

}
