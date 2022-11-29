package de.telrun.khakov.rustam.leson4;


/**
 * @author Rustam Khakov
 */
public class JavaStringTest {
	public static void main(String[] args) {
		String str = "I study Basic Java!";
		System.out.println(str.charAt(str.length() - 1 ));
		System.out.println(str.contains("Java"));
		System.out.println(str.replace('a', 'o'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(str.indexOf("Java")));
		System.out.println(str.indexOf('d'));

//		1 Создайте строку I study Basic Java!
//		2 Распечатать последний символ строки. Используем метод String.charAt().
//		4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//		5 Заменить все символы “а” на “о”.
//		6 Преобразуйте строку к верхнему регистру.
//		7 Преобразуйте строку к нижнему регистру.
//		8 Вырезать строку Java c помощью метода String.substring().
//		9. напишите программу для подсчета какой индекс у символа 'd'

//		10. Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner
//		 и после пишет на консоль “Hello *…….. !*
//		вместо многоточий имя
//		11. Напишите программу, которая спрашивает имя и считывает его с консоли
//		 с помощью java.util.Scanner и после пишет "Ваше имя начинается с буквы ..."
	}
}
