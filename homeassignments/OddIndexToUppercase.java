package homeassignments;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		// System.out.println(charArray);

		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 == 0) {
				System.out.println(charArray[i]);
			}
			if (i % 2 != 0) {
				//Use Charater class to change char array to upper case
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.println(upperCase);
			}
		}

		// test.toUpperCase();

	}

}
