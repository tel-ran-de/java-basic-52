package de.telrun.khakov.rustam.lesson6;

/**
 * @author Rustam Khakov
 */
public class PizzaTime {
	public static void main(String[] args) {
		//    28 и 24 см диаметр
		//    40 калорий
		//   на сколько в большой пицце боьше калорий
		double sqrSmall = Math.PI * 24 * 24;
		double sqrBig = Math.PI * 28 * 28;
		double diff = (sqrBig - sqrSmall) * 40;
		System.out.println("Разница в калориях = " + diff);
		String str1 = "wowo";
		String str2 = "ogogo"; // str1, st2 -> wow-ogo-wow
		String res = magicFunc(str1, str2);
		System.out.println(res);

	}

	public static String magicFunc(String s1, String s2) {
		return s1 + "-" + s2 + "-" + s1;
	}

}
