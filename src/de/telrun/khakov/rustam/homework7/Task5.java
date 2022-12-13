package de.telrun.khakov.rustam.homework7;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task5 {
	public static void main(String[] args) {
		//5) стране А ездят машины с номерами от 1 до 10000, в городе Б большая проблема с парковками по выходным,
		// чтобы уменьшить количество пробок, власти решили пускать в город по выходным только легковые машины
		// с четными номерами, напишите программу, которая принимает на вход два параметра:  номер машины и
		// isLorry (грузовая машина или нет), в результате программа выводит можно заезжать машине или нет в город
		Random random = new Random();
		int number = random.nextInt(1, 10000);
		boolean isLorry = random.nextBoolean();
		System.out.printf("номер %s грузовик? %s\n", number, isLorry);
		// машина легковая = не грузовая и номер машины четный


		if (!isLorry && number % 2 == 0) {
			System.out.println("можно");
		} else {
			System.out.println("нельзя");
		}

	}
}
