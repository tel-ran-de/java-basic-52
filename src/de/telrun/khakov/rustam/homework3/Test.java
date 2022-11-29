package de.telrun.khakov.rustam.homework3;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Test {
	public static void main(String[] args) {
		String str = "I love Java Lessons!";
		int indexOfL = str.indexOf('L');
		int indexOfLastChar = str.indexOf('!');
		System.out.println(str.substring(indexOfL, str.length() - 1));
		Scanner scan = new Scanner(System.in);
		boolean b = scan.nextBoolean();

	}
}
