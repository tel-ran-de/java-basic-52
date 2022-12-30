package de.telrun.khakov.rustam.homework11;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	/**
	 * Необходимо, чтоб программа выводила на экран вот такую последовательность:
	 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
	 */
	public static void main(String[] args) {
		int from = 7;
		int to = 98;
		int step = 7;
		int current = from;
		while (current <= to) {
			System.out.print(current + " ");
			current += step;
		}
	}
}
