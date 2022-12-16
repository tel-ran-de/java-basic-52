package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class ForInFor {
	public static void main(String[] args) {
		int width = 10;
		int high = 10;
		for (int i = 0; i < high; i++) {
			for (int j = 0; j < width; j++) {
				if (j < (high - i)) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
