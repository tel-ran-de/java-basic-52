package de.telrun.khakov.rustam.homework6;

/**
 * @author Rustam Khakov
 */
public class HW1 {

	//1) Введите с консоли два числа и выведите больше ли второе число чем   первое
	//2) Создайте метод, который принимает 2 числа и возвращает больше или равно первое число по сравнению со вторым
	//3) создайте метод который будет принимать 2 строки и писать возвращать строку, которая составляется склеиванем первой половины первого слова и второй половины второго слова
	//Например
	//Вход : "привет" и "цветок". на выходе будет "приток". (при - первая половина от первого слова, ток - вторая половина от второго слова)
	public static void main(String[] args) {
		boolean res = isMoreOrEquals(4,5);
		System.out.println(res);
		System.out.println(smartConcat("цена", "печенье"));
	}

	//2 числа и возвращает больше или равно первое число по сравнению со вторым
	// больше или равно первое число по сравнению со вторым
	public static boolean isMoreOrEquals(int first, int second) {
		return first >= second;
	}

	// "при вет"  "цве ток"
	public static String smartConcat(String str1, String str2) {
		String f = str1.substring(0, str1.length() / 2);
		String s = str2.substring(str2.length()/2);
		return f + s;
	}
}
