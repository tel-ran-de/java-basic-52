package de.telrun.khakov.rustam.lesson12;

import java.util.Arrays;

/**
 * @author Rustam Khakov
 */
public class ArrayTest {
	public static void main(String[] args) {
		int i = 1;
		int[] array = new int[5];
		String[] str = {"f", "s", "t", "t", "f"};
		System.out.println(array.length);
		array[0] = 9;  //1
		array[1] = 6;  //2
		array[2] = 3;  //3
		array[3] = 4;  //4
		array[4] = 7;  //5
		int[] clone = array.clone();
		//array[5] = 8;  //6
		int[] ints = Arrays.copyOfRange(array, 3, 5);
		int[] arraySix = Arrays.copyOf(array, 6);
		Arrays.sort(array);
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arraySix));

		int[] array2 = array;
		int[] array3 = array.clone();
		System.out.println(array[0]);
		System.out.println(array2[0]);
		System.out.println(array3[0]);
		array[0] = 1;
		System.out.println(array[0]);
		System.out.println(array2[0]);
		System.out.println(array3[0]);

	}
}
