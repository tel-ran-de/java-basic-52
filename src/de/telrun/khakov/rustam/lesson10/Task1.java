package de.telrun.khakov.rustam.lesson10;

/**
 * @author Rustam Khakov
 */
public class Task1 {
	public static void main(String[] args) {
		//В кассу на пятипроцентный вклад положили 200 рублей.
		// Какой станет сумма вклада через 10 лет?
		//5 процентов = 0.05 к примеру 3% от ста рублей 100 *0.03 = 3
		// 1. нет капитализации -> сумма процентов не прибавляется к вкладу
		// 2. с капитализацией -> сумма процентов прибавляется к вкладу в конце года
		double income = 200.0;
		int howManyYears = 10;
		double percent = 0.05;
		double finalSumWithoutCap = income;
		double finalSumWithCap = income;
		///
		for (int i = 0; i < howManyYears; i++) {// 200 210
			finalSumWithoutCap += income * percent;
			finalSumWithCap += finalSumWithCap * percent;
		}
		System.out.println(finalSumWithoutCap);
		System.out.println(finalSumWithCap);

	}
}
