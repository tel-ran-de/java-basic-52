package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class ForExample {
	public static void main(String[] args) {
//		int i0 = 1;
//		int i2 = 2;
//		int i3 = 3;
//		///
//		int i9 = 10;

		int sum = 0;// 0 2 4 6 8
		for (int i = 0; i <= 10; i += 2) {  // i+=2 -> i = i + 2
			sum += i;
			System.out.println(i);
		}
//		int from = 0;
//		int to = 10;
//		for (int current = from; current < to; current++) {
//
//		}

		int j = 0;
		for (j = 0; j < 0; j++) {
			System.out.println("jj");
		}
		System.out.println(j);
		System.out.println("Сумма " + sum);

	}
}
