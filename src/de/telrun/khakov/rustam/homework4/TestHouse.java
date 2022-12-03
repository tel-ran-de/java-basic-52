package de.telrun.khakov.rustam.homework4;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class TestHouse {
	public static void main(String[] args) {
		House houseWithOwner = new House(10, 10, 3, "Pethya", "Strasse 3");
		House houseWithoutOwner = new House(10, 10, "Strasse 4");
		Scanner scanner = new Scanner(System.in);
		//String str1 = scanner.next();
		String str = "test";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.substring(1,2));
		//int y = f(x);// y = x + 5 -> f(x) = x +5   -> y = f(3) -> 3+ 5

		int y = f(9);
		build(3, houseWithoutOwner);
		System.out.println(y);
	}

	public static void build(int high, House house) {
		house.high = high;
	}

	public static int f(int x) {
		return x + 5;
	}
}
