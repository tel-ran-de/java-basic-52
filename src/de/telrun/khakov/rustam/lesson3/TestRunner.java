package de.telrun.khakov.rustam.lesson3;

/**
 * @author Rustam Khakov
 */
public class TestRunner {
	public static void main(String[] args) {
		int val;
		val = 1;
		System.out.println(val);

		Student petya = new Student();
		System.out.println(petya.birthYear);
		petya.birthYear = 1991;
		System.out.println(petya.birthYear);
		Student vasya = new Student();
		vasya.birthYear = 1994;
		Student.PI = 134;
		System.out.println(Student.PI);
		System.out.println(Math.PI);
	}
}
