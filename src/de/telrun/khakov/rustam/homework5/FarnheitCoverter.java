package de.telrun.khakov.rustam.homework5;

/**
 * @author Rustam Khakov
 */
public class FarnheitCoverter {
	//напишите класс с методами для конвертации градусы цельсия в фаренгейты и метод для конвертации фаренгейтов в цельсия
	//	//(Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C
	//	//Цельсий х 1,8 + 32 = Фаренгейт Пример: 10°C x 1,8 + 32 = 50°F
	int fromCelcius(int celc) {
		return (int)(celc * 1.8 + 32);
	}

	int toCelcius(int farenheit) {
		return (int)((farenheit - 32) / 1.8);
	}
}
