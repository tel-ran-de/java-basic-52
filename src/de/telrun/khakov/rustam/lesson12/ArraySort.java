package de.telrun.khakov.rustam.lesson12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class ArraySort {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[15];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}

		int index = 0;
		int max = 0;
		for (int j = 0; j < array.length; j++) {
			index = 0;
			max = 0;
			for (int i = 0; i < array.length - 1 - j; i++) {
				if (array[i] > max) {
					max = array[i];
					index = i;
				}
			}
			int temp = array[array.length - 1];
			array[array.length - 1] = array[index];
			array[index] = temp;
		}

		System.out.println(Arrays.toString(array));
		System.out.println(max);
	}
}
