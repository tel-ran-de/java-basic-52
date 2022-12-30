package de.telrun.khakov.rustam.homework12;

/**
 * @author Rustam Khakov
 */
public class Task4 {
	/**
	 * 4. Создайте массив из пяти фамилий и выведите их на экран столбиком.
	 */
	public static void main(String[] args) {
		String[] names = {"Davidov","Semyoin","Antonov","Arorin","Avitin"};// или new String[]{"David","Sem","An"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
