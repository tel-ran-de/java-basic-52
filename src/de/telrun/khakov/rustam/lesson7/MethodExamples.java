package de.telrun.khakov.rustam.lesson7;

/**
 * @author Rustam Khakov
 */
public class MethodExamples {
	public static void main(String[] args) {
		int res = Integer.valueOf("123");
		res++;

		String str = "123" + "123";// 123123
		System.out.println(res);
		String first = "125";
		String second = "126";
		int result = sum(first, second);
		System.out.println(first + " +" + second + "=" + result);
	}

	//метод который принимает 2 строки и возращает 1 число - int -> сумма двух строк переведнных в int
	public static int sum(String first, String second) {
		int num1 = Integer.valueOf(first);
		int num2 = Integer.valueOf(second);
		return num1 + num2;
	}
}
