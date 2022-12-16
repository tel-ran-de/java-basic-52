package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class ForTriangle {
	public static void main(String[] args) {
		int howManyStars = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < howManyStars; j++) {
				System.out.print("*");
			}
			System.out.println();
			howManyStars +=2;
		}
	}
}
