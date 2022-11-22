package de.telrun.khakov.rustam.homework1;

/**
 * @author Rustam Khakov
 */
public class Task2 {
	public static void main(String[] args) {
		//Дано трехзначное число. Вывести на экран все цифры этого числа
		// % и /
		int number = 836;// 3 сотни 4 десяток и 5 единиц
		// 345 -> 345 /10 -> 34 %10
		int hundreds = number / 100; // 3 сотни
		int dec = (number % 100) / 10; //(number /10)%10 // 4 десятых
		int num = number % 10; // 5 единиц
		System.out.println(hundreds);
		System.out.println(dec);
		System.out.println(num);
	}
}
