package de.telrun.khakov.rustam.homework11;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task5 {
	//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
	// (заранее не известно сколько цифр будет в числе).
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;
		while (number != 0) {
			int digit = number% 10;
			sum += digit;
			number /= 10;
		}
		System.out.println(sum);
	}
}
