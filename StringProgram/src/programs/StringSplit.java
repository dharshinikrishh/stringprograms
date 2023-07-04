package programs;

public class StringSplit {
	public static void main(String[] args) {
		String s="how to learn a java programming";
		String[]str=s.split("");
		for(String d:str) {
			System.out.println(d);
		}
	}

}
