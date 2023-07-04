package programs;

public class RemoveDuplicateCharacter {
	
	private static void removeDuplicateChar(String input, char d) {

        String res = input.replaceAll(String.valueOf(d), "");

        System.out.println(res);

    }
	public static void main(String[] args) {

		removeDuplicateChar("abdakdadderd", 'd');

		removeDuplicateChar("Dharshuuu", 'u');

		removeDuplicateChar("1255ew23", 'e');

 

    }

}
