package de.telrun.khakov.rustam.lesson6;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class ConverterTest {
	public static void main(String[] args) {
		Random random = new Random();
		double rate = random.nextDouble(1.01, 1.03);
		System.out.println("Курс обмена сейчас: " + rate);
		Converter converter = new Converter(rate);

		int usd = random.nextInt(500);
		System.out.println("Usd total " + usd);
		System.out.println(converter.toEur(usd));

		int eur = random.nextInt(500);
		System.out.println("Eur total " + eur);
		System.out.println(converter.toUsd(eur));
	}
}
