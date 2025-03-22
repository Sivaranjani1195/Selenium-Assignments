package homeassignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "Stops";
		String text2 = "Potss";
		text1 = text1.toUpperCase();
		text2 = text2.toUpperCase();
		int lengthOfText1 = text1.length();
		int lengthOfText2 = text2.length();
		if (lengthOfText1 == lengthOfText2) {
			System.out.println("Length of both texts is equal");
		}

		else {
			System.out.println("Length if both texts is not equal");
		}
		char[] charArray = text1.toCharArray();
		char[] charArray1 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		if (Arrays.equals(charArray, charArray1)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
