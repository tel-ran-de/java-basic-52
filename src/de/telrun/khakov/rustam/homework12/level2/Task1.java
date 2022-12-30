package de.telrun.khakov.rustam.homework12.level2;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class Task1 {

	/**
	 * 1. Есть два массива char[] first = {‘a','b','c','d','e'} и char[] second = {‘f','g','h','i','g'}
	 * создать массив соединяющий два этих массива в один новый
	 */
	public static void main(String[] args) {
		char[] first = {'a','b','c','d','e'};
		char[] second = {'f','g','h','i','g'};
		char[] third = new char[first.length + second.length];
		for (int i = 0; i < first.length; i++) {
			third[i] = first[i];
		}
		//добавляем все что больше первого
		for (int i = 0; i < second.length; i++) {
			third[i + first.length] = second[i];
		}
		System.out.println(Arrays.toString(third));
	}
}
