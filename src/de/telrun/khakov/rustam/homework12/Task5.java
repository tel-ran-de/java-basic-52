package de.telrun.khakov.rustam.homework12;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task5 {
	/**
	 * 5. В массиве, состоящем из N вещественных элементов (вводится из консоли), после заполняется случайными числами,
	 * найти максимальный по модулю элемент массива. Подсказка: модуль числа Math.abs(..)
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = Task2.generateRandomArray(n, -100, 100);
		int max = 0;// помодулю самое маленькое число 0
		for (int i = 0; i < arr.length; i++) {
			int absVal = Math.abs(arr[i]);
			if (absVal > max) {
				max = absVal;
			}
		}
		System.out.printf("Max abs val: %d", max);
	}
}
