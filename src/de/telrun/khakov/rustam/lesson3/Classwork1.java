package de.telrun.khakov.rustam.lesson3;

/**
 * @author Rustam Khakov
 */
public class Classwork1 {
	public static void main(String[] args) {
		int val = 123; // 123 /2 = 61 (1)
		System.out.println(Integer.toBinaryString(val));
		//System.out.println(Integer.toOctalString(val));
		//System.out.println(Integer.toHexString(val));
		val = 123>>1; // val / 2 ->    1111 011  -> 1111 01
		System.out.println(Integer.toBinaryString(val));
		val = 123<<1; // val * 2 ->    1111 011 -> 1111 0110

		System.out.println(Integer.toBinaryString(val));




	}
}
