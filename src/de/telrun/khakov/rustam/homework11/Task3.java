package de.telrun.khakov.rustam.homework11;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task3 {
	//Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь с клавиатуры. Например от 10 до 100
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int from = scanner.nextInt();
		int to = scanner.nextInt();
		int current = from;
		int sum = 0;
		while (current <= to) {
			if (isOdd(current)) {
				sum += current;
			}
			current++;
		}
		System.out.println(sum);
	}

	public static boolean isOdd(int number) {
		return number % 2 == 1;
	}
}
