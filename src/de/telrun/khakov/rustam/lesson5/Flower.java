package de.telrun.khakov.rustam.lesson5;

/**
 * @author Rustam Khakov
 */
public class Flower {
	String color;
	int size;
	int hight;
	int butonCount;

	public Flower(int size, int hight, String color) {
		this.color = color;
		this.size = size;
		this.hight = hight;
	}

	public Flower(int size, int hight) {
		this.size = size;
		this.hight = hight;
	}
}
