package de.telrun.khakov.rustam.homework11.level2;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task1 {

	/**
	 * сломанный лифт
	 * лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
	 * Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем
	 * подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх.
	 * Найдите количество подьемов, которые понадобятся лифту.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int current = 0;
		int counter = 0;
		while (current < h) {
			current = current + n - m;
			counter++;
		}
		System.out.println(counter);
	}
}
