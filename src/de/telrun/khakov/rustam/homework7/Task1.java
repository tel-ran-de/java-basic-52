package de.telrun.khakov.rustam.homework7;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		//3)Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
		//   Напишите программу которая спрашивает у покупатель сколько он хочет купить печенья,
		//   после этого с помощью Scanner считывается число сколько печенья хочет купить покупатель,
		//   после спрашивается сколько денег у покупателя и считывается число (сколько денег у покупателя),
		//   программа должна написать может ли купить столько печенья за такие деньги, например
		//   покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
		//   покупатель хочет купить 12 печенек, у него 8 евро ответ  можно

		double price = 0.5;
		int howMuchIWant = 4;
		int money = 10;
		// (money / price) >= howMuchIWant
		// money / howMuchIWant <= price
		if (price * howMuchIWant <= money) {
			System.out.println("можно");
		} else {
			System.out.println("нельзя");
		}

		check();
	}


	//напишите программу, которая говорит выпал орел или решка
	//   true - орел
	//   false -решка
	//   используйте Random и метод nextBoolean,
	public static void check() {
		Random random = new Random();
		boolean isTail = random.nextBoolean();
		if (!isTail) { // isTail -> true   !isTail -> false
			//..
		} else {
			//
		}
	}
}
