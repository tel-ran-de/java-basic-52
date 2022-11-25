package de.telrun.khakov.rustam.leson4;

/**
 * @author Rustam Khakov
 */
public class Flower {
	public int size;
	protected int price = 13;

	public int changePrice() {
		//logic for price change
		//оповещаем продавца что цена поменялась
		price = price + 10;
		return price;
	}

	public int getPrice() {
		return price;
	}
}
