package de.telrun.khakov.rustam.lesson7;

/**
 * @author Rustam Khakov
 */
public class IncTest {
	public static void main(String[] args) {
		int a = 1; // 1
		int b = a++; //1   a++ -> a = a + 1;  a++ -> a = a+1
		//2
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
