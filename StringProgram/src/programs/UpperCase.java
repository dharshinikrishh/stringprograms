package programs;

public class UpperCase {

	public static String convertToUpperCase(String input) {
		return input.toUpperCase();
	}

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		String uppercaseString = convertToUpperCase(inputString);
		System.out.println(uppercaseString);
	}
}