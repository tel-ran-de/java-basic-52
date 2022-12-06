package de.telrun.khakov.rustam.lesson7;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class MethodTest {

	public static void main(String[] args) {
		//System.out.println(getRandomStudent());

		int i = 3;
		int j = 4;

		int temp = i;
		i = j;
		j = temp;
		//swap(i, j);//
		System.out.println(i);
		System.out.println(j);
	}

	//метод выбора студента
	public static int getRandomStudent(){
		Random random = new Random();
		return random.nextInt(10);
	}

	//метод который принимает 2 числа и должен поменять местами эти два числа
	// first = [4]  second = [3]   temp = [3]
	public static int swap(int first, int second) { // first = 3, second = 4
		int temp = first;
		first = second;
		second = temp;
		return first;
	}

}
