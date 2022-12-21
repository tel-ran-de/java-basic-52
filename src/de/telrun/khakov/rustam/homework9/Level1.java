package de.telrun.khakov.rustam.homework9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Level1 {
	public static void main(String[] args) throws FileNotFoundException {
		int first = 2000;
		int sec = 2022;
		int howManyYears = (sec - first) / 4;
		int counter = 0;
		for (int i = first; i <= sec; i++) {
			if (isLeapYear(i)) {
				counter++;
			}
		}
		System.out.println(counter);

		for (int i = 10; i < 100; i++) {
			if (i % 4 == 0 && i % 6 != 0) {
				//
			}
		}

		//Вывести на консоль числа от -10 до -40. //-10 -11 -12 ... -40
		// -10
		// -11
		// -12
		for (int i = -10; i >= -40; i--) {
			System.out.println(i);
		}

		for (int i = 13; i < 100; i += 13) {
			if (i % 2 != 0) {
				//
			}
		}

//		Scanner scanner = new Scanner(new File("/Users/rustamkhakov/work/java-course/src/de/telrun/khakov/rustam/homework8/Level2"));
//		int f = scanner.nextInt();
//		int s = scanner.nextInt();
//		String scanVal = scanner.nextLine();
//		int actual = scanner.nextInt();
//		if (f * s == actual) {
//			System.out.println("Правильно");
//		} else {
//			System.out.printf("неправильно, должно быть  %s", f * s);
//		}


	}

	private static boolean isLeapYear(int i) {
		return i % 4 == 0;
	}

	// делится на 1 и на себя - простое
	// 10    6 7 8 9
	// 9  2 5
	// 25
	static boolean isNumberSimple(int number) {
		for (int i = 2; i <= number /2; i++) {/// number  seconds
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	int i1 = 2;
	int i2 = 5;
	int i3 = 6;
	int i4 = 10;
	boolean isRain = (i2 % i1 ==0 || i3 % i1==0) && i2% i1 == 0;  /// || = +   && = *
	// A || B && C
	// 1. B&&C
	// 2. A || (1)
	// (A || B) && C
	// 1. A || B
	// 2. (1) && C
}
