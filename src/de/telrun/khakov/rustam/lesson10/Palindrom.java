package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class Palindrom {
	public static void main(String[] args) {
		//арозаупаланалапуазора
		String str = "арозаупаланалапуазора";// length - 1

		System.out.println(isPalindrom(str));
		System.out.println(isPalindrom("test"));
		System.out.println(isPalindrom("tet"));
		System.out.println(isPalindrom("tossot"));


	}

	public static boolean isPalindrom(String str) {
		boolean isPalindrom = true;
		for (int i = 0; i < str.length() / 2; i++) {
			char firstPart = str.charAt(i);
			char secondPart = str.charAt(str.length() - 1 - i);
			if (firstPart != secondPart) {
				isPalindrom = false;
				break;
			}
		}
		return isPalindrom;
	}
}
