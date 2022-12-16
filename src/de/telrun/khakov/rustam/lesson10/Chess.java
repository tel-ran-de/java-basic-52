package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class Chess {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (count % 2 == 0) {//
					System.out.print("x ");
				} else {
					System.out.print("0 ");
				}
				count++;
			}
			System.out.println();
		}
	}
}
