package de.telrun.khakov.rustam.lesson9;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class MagicClass {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100);
		String str = null;
		if (num > 50) {
			str = "больше 50";
		} else {
			str = "меньше или равно 50";
		}

		//
		str = num > 50 ? "больше 50" : "меньше или равно 50";
	}

	public static String getStrValue(int num) {
		////какая-то логика
//		if (num > 50) {
//			return "больше 50";
//		} else {
//			return "меньше или равно 50";
//		}
		return num > 50 ? "больше 50" : "меньше или равно 50";
	}
}
