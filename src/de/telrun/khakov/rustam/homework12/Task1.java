package de.telrun.khakov.rustam.homework12;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	/**
	 * 1. Найти номер и значение первого положительного элемента массива.
	 */
	public static void main(String[] args) {
		int[] arr = new int[]{-5, -3, 10, -12, 12,13,14,-34, 15};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >=0) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("нет положительных чисел");
	}
}
