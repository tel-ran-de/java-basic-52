package de.telrun.khakov.rustam.homework1;

/**
 * @author Rustam Khakov
 */
public class Task3 {
	public static void main(String[] args) {
		//0,1, 2, 3, 4, 5, 6, 7, 8, 9
		int first = 15; //32 ячейки выделяется
		int second = 1;
		int third = 2;
		int forth = 3;
		int fifth = 4;
		int sixth = 5;
		int seventh = 6;
		int eith = 7;
		int ninth = 8;
		int tenth = 9;

		int sum = first + second + third + forth + fifth + sixth + seventh + eith + ninth + tenth;
		int average = sum / 10;
		int mod = sum % 10;

		System.out.println(average);
		System.out.println(mod);
	}
}
