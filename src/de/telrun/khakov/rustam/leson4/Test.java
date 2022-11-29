package de.telrun.khakov.rustam.leson4;


/**
 * @author Rustam Khakov
 */
public class Test {
	public static void main(String[] args) {
		Flower flower = new Flower();
		flower.size = 8;
		flower.getPrice();

		byte b = 14;
		short s = b;
		int i = s;
		long l = i;
		double d = l;
		b = (byte) (b +3);
		//int i2 = l;

		int longInt = 268435584;
		short fromInt = (short) longInt;
		long longLong = 12345667;
		int intFromLong = (int) longLong;
		System.out.println(fromInt);


		byte r = 1;
		byte y = (byte)(r * r);
	}
}
