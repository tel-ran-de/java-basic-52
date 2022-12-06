package de.telrun.khakov.rustam.lesson7;

import java.sql.Date;
import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Test {
	public static void main(String[] args) {
		String str = "test sTring";
		Bottle bottle = new Bottle();
		Date date = new Date(1L);
		System.out.println(str.getClass().getClassLoader());
		System.out.println(date.getClass().getClassLoader());
		System.out.println(bottle.getClass().getClassLoader());

	}
}
