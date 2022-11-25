package de.telrun.khakov.rustam.leson4;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class StringExample {
	public static void main(String[] args) {
		String str = "test";// 0 = t 1 = e 2 = s 3 = t
		String strUpper = str.toUpperCase();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println("Wow! " + str);
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('t'));
		System.out.println(str.lastIndexOf('t'));
		System.out.println(str.indexOf("st"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 3));
		System.out.println(strUpper);
		System.out.println(str.replace('t','v'));
		System.out.println(str.startsWith("te"));
		String sumRes = str + "tt"; // str.concat("tt");

		Scanner scanner = new Scanner(System.in);
		String readVal = scanner.nextLine();
		System.out.println(readVal);
	}
}
