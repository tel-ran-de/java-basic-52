package de.telrun.khakov.rustam.homework12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task2 {
	/**
	 * 2. Создайте массив А[1..100] с помощью генератора случайных чисел и выведите его на экран. Увеличьте все его элементы в 2 раза.
	 * */
	public static void main(String[] args) {
		int size = 100;
		int minVal = -100;
		int maxVal = 100;
		Random random = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(minVal, maxVal);
		}
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * вынес в отдельный метод чтобы переиспользовать после
	 * @param size размер массива
	 * @param minVal минимальное значение
	 * @param maxVal максимальное значение
	 * @return массив с генерированными числами
	 */
	public static int[] generateRandomArray(int size, int minVal, int maxVal) {
		Random random = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(minVal, maxVal);
		}
		return arr;
	}
}
