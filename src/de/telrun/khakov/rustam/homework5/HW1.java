package de.telrun.khakov.rustam.homework5;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class HW1 {
	//1.) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину
	//2) Написать метод который будет возвращать результат склейки двух строк. например:
	//вызывается метод со строками  "I love " и "Java" после этого метод вернет I love Java
	//3) создайте 5 методов с разной сигнатурой, но с одинаковым названием метода
	//4) напишите класс с методами для конвертации градусы цельсия в фаренгейты и метод для конвертации фаренгейтов в цельсия
	//(Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C
	//Цельсий х 1,8 + 32 = Фаренгейт Пример: 10°C x 1,8 + 32 = 50°F
	//5) напишите метод для получения суммы трех чисел
	// Вася -  765
	// Путя - 665

	// перегрузка - overload -

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String name = scanner.nextLine();
		//System.out.println(name.length());
		System.out.println(concat("I love ", "Java"));

		FarnheitCoverter farnheitCoverter = new FarnheitCoverter();
		System.out.println(farnheitCoverter.fromCelcius(10));
		System.out.println(farnheitCoverter.toCelcius(50));
	}

	//напишите метод для получения суммы трех чисел
	static int calc3Numbers(int first, int sec, int third) {
		return first + sec + third;
	}

	//Написать метод который будет возвращать результат склейки двух строк. например:
	public static String concat(String first, String second) {
		return first + second;
	}

	public static int test() { // test()
		return 1;
	}

	public static int test(int i) { // test(int)
		return 1;
	}

	public static int test(double d, String s) { //test(double, String)
		return 1;
	}

	public void test(double d) {//test(double)

	}

	public void test(String s, double d) {//test(String, double)

	}


}
