package programs;

import java.util.Scanner;

public class AlphabetOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Character:");
		char c=sc.next().charAt(0);
		if((c>='a' && c<='z')||(c>='A' && c<='z'))
			System.out.println(c + " is an alphabet");
		else
			System.out.println(c + " is not an alphabet");
		sc.close();
		
	}

}
