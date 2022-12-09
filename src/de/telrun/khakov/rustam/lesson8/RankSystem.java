package de.telrun.khakov.rustam.lesson8;

/**
 * @author Rustam Khakov
 */
public class RankSystem {

	/// бальная система -
	// 0 -55 - неуд
	// 56 - 71 - удовлетворительно
	// 72 - 85 - хорошо
	// 86 - 100 - отлично   // 86 <= point< 100  // point>= 86 && point <=100
	public void calcRank(int point) {
		if (point > 100 || point <0) {
			System.out.println("невалидный балл: " +  point);
		} else if (point >= 86) {
			System.out.println("Отлично");
		} else if (point >= 72) {
			System.out.println("Хорошо");
		} else if (point>=56) {
			System.out.println("удовлетворительно");
		} else {
			System.out.println("неуд");
		}
	}
}
