package programs;

import java.util.Scanner;

public class CompareTo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Enter the String");
		String str2=sc.nextLine();
		System.out.println(str1.compareTo(str2));
	}

}
