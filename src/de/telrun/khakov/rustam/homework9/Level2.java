package de.telrun.khakov.rustam.homework9;

/**
 * @author Rustam Khakov
 */
public class Level2 {
	public static void main(String[] args) {
		//factRec(500000);
		String s = "123456";
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < s.length() /2; i++) {
			int val = Integer.valueOf(s.charAt(i));
			sum += val;
		}

		for (int i = s.length()/2; i < s.length(); i++) {
			int val = Integer.valueOf(s.charAt(i));
			sum2 += val;
		}
		if( sum2 == sum) {
			//
		}
	}

	static int fact(int number) {
		int res = 1;
		for (int i = 1; i < number; i++) {
			res *= i;
		}
		return res;
	}

	// 10
	// fact(10) = 10 * fact(9) = 10 * 9 *7...1
	// fact(9) = 9 * fact(8);
	//fact(8) = 8 * fact(7);
	//...
	// fact(2) = 2 * fact(1);
	// fact(1) = 1;

//	static int factRec(int number) {
//		if (number == 1) {
//			return 1;
//		} else {
//			return number * factRec(number - 1);
//		}
//	}
}
