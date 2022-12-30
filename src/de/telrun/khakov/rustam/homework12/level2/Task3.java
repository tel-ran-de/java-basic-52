package de.telrun.khakov.rustam.homework12.level2;

import de.telrun.khakov.rustam.homework12.Task2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task3 {
	public static void main(String[] args) {
		int[] arr = Task2.generateRandomArray(20, 0,2);
		System.out.println(Arrays.toString(arr));

		int maxLength = 1;
		int maxLengthIndex = 0;
		int candidateMax = 1;
		int candidateIndex = 0;
		/// 1 0 0 0 1 1 0 0 1 1 1 1
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				candidateMax++;
			} else {
				if (maxLength < candidateMax) {
					maxLength = candidateMax;
					maxLengthIndex = candidateIndex;
				}
				candidateMax = 1;
				candidateIndex = i;
			}
		}
		if (maxLength < candidateMax) {
			maxLength = candidateMax;
			maxLengthIndex = candidateIndex;
		}
		System.out.println(maxLengthIndex);
		System.out.println(maxLength);
	}
}
