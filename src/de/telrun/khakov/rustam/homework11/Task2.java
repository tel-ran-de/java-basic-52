package de.telrun.khakov.rustam.homework11;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task2 {

	/**
	 * Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0. После ввода нуля, показать
	 * на экран количество чисел, которые были введены, их общую сумму и среднее арифметическое. Подсказка:
	 * необходимо объявить переменную-счетчик, которая будет считать количество введенных чисел, и переменную,
	 * которая будет накапливать общую сумму чисел.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int current;
		int counter = 0;
		int sum = 0;
		do {
			current = scanner.nextInt();
			sum += current;
			if (current == 0) {
				System.out.printf("Сумма чисел %d %n", sum);
				System.out.printf("Введено %d чисел%n", counter);
				if (counter != 0) {
					System.out.printf("среднее арифмитическое %d %n", sum / counter);
				}
			}
			counter++;
		} while (current != 0);
	}
}
