package de.telrun.khakov.rustam.homework12.level2;

import java.util.Scanner;

/**
 * @author Rustam Khakov
 */
public class Task22 {
	/**
	 * Анатолию в последний месяц удача улыбалась очень плохо. У него 3 раза взломали пароль.
	 * Вот он и задумался над тем, что неправильно подходит к вопросу составления паролей.
	 * Чтобы не напрягаться больше и опять не попасть впросак. Требования к паролю у Анатолия следующие
	 * (он внимательно изучил рекомендации знатоков)
	 * Длина – 8 символов (если меньше – то проще взломать, а если длиннее – то сложно запомнить).
	 * В пароле должны быть:
	 * заглавные буквы,
	 * строчные символы,
	 * числа
	 * специальные знаки (из перечня {'*','-','#',';'} другие спецсимволы недопустимы, так как Анатолий их не может запомнить).
	 */
	public static void main(String[] args) {
		PasswordChecker passwordChecker = new PasswordChecker();
		Scanner scanner = new Scanner(System.in);
		System.out.println("введите пароль:");
		String password = scanner.nextLine();
		if (passwordChecker.isStrict(password)) {
			System.out.println("Все ок");
		} else {
			System.out.println("пароль ненадежный");
		}
	}
}
