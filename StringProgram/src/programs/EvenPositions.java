package programs;

import java.util.Scanner;

public class EvenPositions {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
				
		}
		
	}

}
