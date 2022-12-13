package de.telrun.khakov.rustam.lesson9;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class PerimeterCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("какую фигуру будем считать?");
		String figureType = scanner.nextLine(); //КваДрат
		switch (figureType.toLowerCase()) { // квадрат
			case "квадрат" -> {
				System.out.println("введите сторону квадрата");
				int size = scanner.nextInt();
				System.out.println(size * 4);
			}
			case "круг" -> {
				System.out.println("введите радиус");
				int r = scanner.nextInt();
				System.out.println(2 * r * Math.PI);
			}
			case "треугольник" -> {
				System.out.println("введите 1 сторону треугольника");
				int first = scanner.nextInt();
				System.out.println("введите 2 сторону треугольника");
				int second = scanner.nextInt();
				System.out.println("введите 3 сторону треугольника");
				int third = scanner.nextInt();
				System.out.println(first + second + third);
			}
			default -> System.out.println("эту фигуру я не знаю");
		}
	}
}
