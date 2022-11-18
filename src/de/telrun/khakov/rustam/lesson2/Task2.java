package de.telrun.khakov.rustam.lesson2;

/**
 * @author Rustam Khakov
 */
public class Task2 {
	public static void main(String[] args) {
		//Даны переменные:
		//- деньги которые у нас есть - 1000 рублей
		//- стоимость пиццы - 230 рублей
		//- стоимость жвачки - 26 рублей
		//- стоимость конфеты - 2.5 рубля
		//Задача: представим себе что мы зашли в магазин,
		// и наша задача: купить максимум возможных пиц,
		// затем на сдачу купить максимум жвачек,
		//затем на оставшуюся сдачу купить конфет.
		//В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
		//На эти деньги мы можем купить:
		//- 4 пиццы
		//- 3 жвачки
		//- 0 конфет
		//Сдача с магазина: 2 рубля.
		int money = 1200;
		int pizzaPrice = 230;
		int gymPrice = 26;
		double candyPrice = 2.5;

// 8 / 6 = 1 (2)
		// 8 / 2.5 = (int) (3.2) -> 3
		int howManyPizza = money / pizzaPrice; // 4
		int moneyAfterPizza = money % pizzaPrice; // 80
		int howManyGym = moneyAfterPizza / gymPrice; // 80 / 26 = 3 (2)
		int moneyAfterGym = moneyAfterPizza % gymPrice; // 2
		int howManyCandies = (int) (moneyAfterGym / candyPrice);
		double moneyResult = moneyAfterGym % candyPrice;
		System.out.println("Пиццы купили " + howManyPizza);
		System.out.println("Жевачки купили " + howManyGym);
		System.out.println("Конфет купили " + howManyCandies);
		System.out.println("Осталось " + moneyResult);

	}
}
