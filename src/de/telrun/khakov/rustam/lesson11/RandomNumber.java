package de.telrun.khakov.rustam.lesson11;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		int predict;
		int howManyTries = 0;
		int maxTries = 4;
		System.out.printf("Я загадал число, угадай его, у тебя %s попыток %n", maxTries);
		do {
			howManyTries++;
			predict = scanner.nextInt();
			if (predict > number) {
				System.out.println("мое загаданное число меньше");
			} else if (predict < number) {
				System.out.println("мое загаданное число больше");
			}
		} while (predict != number && howManyTries < maxTries);
		if (predict == number) {
			System.out.printf("Молодец угадал %s, ты потратил %s  попыток", number, howManyTries);
		} else {
			System.out.println("ты проиграл");
		}
	}
}
