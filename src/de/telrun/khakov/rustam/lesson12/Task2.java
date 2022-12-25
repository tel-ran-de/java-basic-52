package de.telrun.khakov.rustam.lesson12;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task2 {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "fsd";
		str[9] = "fas";
		int sum = 0;
		for (int i = 0; i <str.length; i++) {
			if (str[i] != null) {
				sum++;
			}
		}
		System.out.println(sum);

		//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Подсчитайте сколько в массиве чётных элементов
		// и выведете это количество на экран на отдельной строке.
		// ] - включая
		// ) - не включая
		Random random = new Random();
		int evenNumbers = 0;
		int[] randomNumbers = new int[15];
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(10);
			if (randomNumbers[i] % 2 == 0) {
				evenNumbers++;
			}
		}
		System.out.println(Arrays.toString(randomNumbers));
		System.out.println(evenNumbers);

	}
}
