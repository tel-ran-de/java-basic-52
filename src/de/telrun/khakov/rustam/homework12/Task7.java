package de.telrun.khakov.rustam.homework12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task7 {
	/**
	 * 7. Все элементы массива поделить на значение наибольшего элемента этого массива.
	 * Задача состоит из двух подзадач:
	 * Поиск максимума.
	 * Деление на него элементов массива
	 */
	public static void main(String[] args) {
		double[] arr = generateRandomArray(100, -100, 100);
		double max = Double.MIN_VALUE;//минимальное значение пищем как максимум в начале
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.printf("Max val %s%n", max);
		if (max == 0) {
			System.out.println("на ноль делить нельзя, максимум ноль");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] /= max;
		}
		System.out.println(Arrays.toString(arr));
	}


	public static double[] generateRandomArray(int size, int minVal, int maxVal) {
		Random random = new Random();
		double[] arr = new double[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextDouble(minVal, maxVal);
		}
		return arr;
	}
}
