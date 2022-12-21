package de.telrun.khakov.rustam.lesson11;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class InfiniteInput {
	public static void main(String[] args) {
		//Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0. После ввода нуля,
		// показать на экран количество чисел, которые были введены, их общую сумму и среднее арифметическое
		Scanner scanner = new Scanner(System.in);
		int i;
		int sum = 0;
		int count = 0;
		//i = scanner.nextInt();
//		while (i != 0) {
//			sum += i;
//			count++;
//			i = scanner.nextInt();
//		}
		// 1
		// 1  15  18
		// 1  2  3
		do {
			i = scanner.nextInt();
			sum += i;
			count++;
		} while (i != 0);
		System.out.println(sum);
		System.out.println(sum / count);
	}
}
