package de.telrun.khakov.rustam.lesson6;

/**
 * @author Rustam Khakov
 */
public class CalcTest {
	public static void main(String[] args) {
		Dog sharik = null;
		sharik = new Dog("sharik sharikovich");
		Calculator calc = new Calculator();
		int sum = calc.sum(5, 6);
		System.out.println(sum);
		int minus = calc.minus(10, 3);
		System.out.println(minus);
		int mult = calc.mult(3, 4);
		System.out.println(mult);
		double div = calc.div(7, 3);
		System.out.println(div);
		short first = 1;
		short sec = 2;
		int sumOf2Shorts = calc.sum(first, sec);
		calc.sum(34L, 14L);
	}
}
