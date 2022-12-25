package de.telrun.khakov.rustam.lesson12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class MaxNumber {

	// от 0 до 10
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[15];
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(max);
	}
}
