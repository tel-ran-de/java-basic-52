package de.telrun.khakov.rustam.homework4;

/**
 * @author Rustam Khakov
 */
public class House {
	private int width;
	private int length;
	private String address;

	int high;
	String owner;


	public House(int width, int length, int high, String owner, String address) {
		this.address = address;
		this.owner = owner;
		this.high = high;
		this.length = length;
		this.width = width;
	}

	public House(int width, int length, String address) {
		this.address = address;
		this.width = width;
		this.length = length;
	}

	public int build(int high) {
		this.high = high;
		return this.high;
	}


	public int getWidth() {
		return this.width;
	}

	public int getLength() {
		return this.length;
	}

	public String getAddress() {
		return this.address;
	}
}
