package programs;

public class RemoveWhiteSpace {
	public static void main(String[] args) {

		String str1 = "Dharshini Krishnan";

		str1 = str1.replaceAll("\\s+", "");

		System.out.println("String after removing all the white spaces : " + str1);
	}

}
