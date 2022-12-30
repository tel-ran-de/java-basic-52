package de.telrun.khakov.rustam.homework12.level2;

/**
 * @author Rustam Khakov
 */
public class PasswordChecker {
	private char[] specSymbols = {'*', '-', '#', ';' };

	//Это одно из возможных решений
	public boolean isStrict(String password) {
		boolean hasDigit = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasSpecSymbols = false;
		if (password.length() < 8) {
			System.out.println("пароль меньше 8 символов");
			return false;
		}
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isDigit(c)) {
				hasDigit = true;
			} else if (Character.isUpperCase(c)) {
				hasUpper = true;
			} else if (Character.isLowerCase(c)) {
				hasLower = true;
			} else if (containsSpecSymbols(c)) {
				hasSpecSymbols = true;
			}
		}

		return hasLower && hasUpper && hasSpecSymbols && hasDigit;

	}

	private boolean containsSpecSymbols(char character) {
		for (int i = 0; i < specSymbols.length; i++) {
			if (specSymbols[i] == character) {
				return true;
			}
		}
		return false;
	}
}
