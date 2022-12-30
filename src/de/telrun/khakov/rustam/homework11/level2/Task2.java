package de.telrun.khakov.rustam.homework11.level2;

import de.telrun.khakov.rustam.homework11.Task3;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task2 {

	/**
	 * Возьмем любое натуральное число. Если оно четное - разделим его пополам, если нечетное - умножим на 3,
	 * прибавим 1 и разделим пополам. Повторим эти действия с вновь полученным числом. Гипотеза гласит,
	 * что независимо от выбора первого числа рано или поздно мы получим 1.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		while (number != 1) {
			if (!Task3.isOdd(number)) { // тут я использовал метод из 3 задачи чтобы не делать проверку деления на 2 еще раз
				number /= 2; //либо number>>1;
			} else {
				number = (number * 3) / 2;
			}
		}
		System.out.println("Гипотеза верна");
	}
}
