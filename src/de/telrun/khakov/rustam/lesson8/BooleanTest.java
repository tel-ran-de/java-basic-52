package de.telrun.khakov.rustam.lesson8;

/**
 * @author Rustam Khakov
 */
public class BooleanTest {
	public static void main(String[] args) {
		boolean isMoreOrEquals = 5 >= 7;
		boolean isEquals = 8 == 7;
		//четное или нет -> делится ли на 2 -> остаток от деления на 2 равен ли нулю
		boolean isEven = 8 % 2 == 0;
		boolean isNotDivBy3 = 10 % 3 != 0; // остаток от деления не равен 0
		System.out.println(isEven);
		int i = 7;
		boolean isDiv2or3 = (i % 2 == 0) || (i % 3 == 0);
		boolean isDiv2and3 = (i % 2 == 0) && (i % 3 == 0);

		// 1011
		//
		int num = 11;
		int num2 = 12;
		System.out.println(num | num2);
		//Math.pow(2,10); //2 power of 10
		//System.out.println(num);

		System.out.println(isDiv3AndNot5(15));

	}

	// написать метод который будет возвращать ответ на вопрос делится ли число на 3 и
	//не делится на 5  -> num % 5 != 0
	public static boolean isDiv3AndNot5(int num) {
		return (num % 3 == 0) && (num % 5 != 0);
	}



}
