package de.telrun.khakov.rustam.leson4;

/**
 * @author Rustam Khakov
 */
public class ReferenceExample {
	public static void main(String[] args) {
		int i = 4; // 5
		int b = i;// 4
		i++;// 5
		Flower roze = new Flower();
		Flower роза = roze;
		роза.size = 3;
		roze.size = 5;
		System.out.println(роза.size);
		//System.out.println(b);
	}
}
