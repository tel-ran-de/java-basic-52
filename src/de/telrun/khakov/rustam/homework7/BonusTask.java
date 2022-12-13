package de.telrun.khakov.rustam.homework7;

import java.util.Random;

/**
 * @author Rustam Khakov
 */
public class BonusTask {

	public static int WORKING_HOURS = 8;

	public static int SECONDS_IN_MINUTE = 60;

	public static int MINUTES_IN_HOUR = 60;

	public static int SECONDS_IN_HOUR = SECONDS_IN_MINUTE * MINUTES_IN_HOUR;

	public static void main(String[] args) {
		//Есть устройство, на табло которого показывается количество секунд,
		// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно
		// в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
		// когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа),
		// а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
		//Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
		//Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные
		// фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
		//Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
		Random random = new Random();
		int secToEnd = random.nextInt(SECONDS_IN_HOUR * WORKING_HOURS);
		int hoursToEnd = secToEnd / SECONDS_IN_HOUR;
		//if ()
	}
}
