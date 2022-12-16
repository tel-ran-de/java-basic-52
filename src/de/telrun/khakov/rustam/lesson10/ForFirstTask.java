package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class ForFirstTask {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i < 100; i++) {// 1 2 3не делится на 3 то пропустить
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
			sum += i;
			count++;
			if (count == 3) {
				break;
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println(count);
	}
}
