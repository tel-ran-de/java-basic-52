package de.telrun.khakov.rustam.lesson12;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		//Создайте массив из всех нечётных чисел от 1 до 99,
		// выведите его на экран в строку в обратном порядке
		int from = 1;
		int to = 99;
		int[] arr = new int[50];
		int index = 0;
		// 1 2 3 4 5 6 7 8 9 ...
		for (int i = from; i <= to; i++) {
			if (i % 2 != 0) {
				arr[index] = i;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("%s, ", arr[i]);
		}
	}
}
