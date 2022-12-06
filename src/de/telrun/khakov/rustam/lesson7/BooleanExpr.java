package de.telrun.khakov.rustam.lesson7;

/**
 * @author Rustam Khakov
 */
public class BooleanExpr {
	public static void main(String[] args) {
		int f = 12;
		int s = 15;
		System.out.println("первый больше чем второй?");
		System.out.println(f>s);
		boolean isSecondEqual = s == 15; // равно ли ==
		boolean isNotEqual = f != 14; // не равно ли !=
		boolean firstValIsMoreOrEqual = f >=11;// больше или равно ли число f
	}
}
