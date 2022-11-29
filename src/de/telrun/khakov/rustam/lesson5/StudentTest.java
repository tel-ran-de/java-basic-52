package de.telrun.khakov.rustam.lesson5;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student(18, "Vasya");
		System.out.println(student.getName());
		Flower flower = new Flower(3,15,"Red");
		Flower flowerWithoutColor = new Flower(3,15);

		Scanner scanner = new Scanner(System.in);
	}
}
