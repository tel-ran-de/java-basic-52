package de.telrun.khakov.rustam.lesson8;

/**
 * @author Rustam Khakov
 */
public class IfTest {
	public static void main(String[] args) {
		int num = 3;
		// если больше 3 говори больше 3, иначе если равно 3 говори 3, иначе говори меньше 3

		if (num > 3) {
			System.out.println("число больше 3");
		} else if (num == 3) {
			System.out.println("число равно 3");
		} else {
			System.out.println("число меньше 3");
		}


	}




}
