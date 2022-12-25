package de.telrun.khakov.rustam.homework11;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task4 {
	public static void main(String[] args) {
		//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
		Random random = new Random();
		int val = random.nextInt(100, 1000);
		System.out.println(val);
		int max = 0;
		//int maxV = Integer.MIN_VALUE;
		while (val > 0) {
			int currentDigit = val % 10;//цифру числа текущую
			val = val / 10; // уменьшаем в 10 раз
			if (currentDigit > max) { // сравниваем с максимумом и переписываем
				max = currentDigit;
			}
		}
		System.out.println(max);
	}
}
