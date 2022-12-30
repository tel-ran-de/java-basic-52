package de.telrun.khakov.rustam.homework12;

/**
 * @author Rustam Khakov
 */
public class Task3 {

	/**
	 * 3. С 8 до 20 часов температура воздуха измерялась ежечасно. Известно, что в течение этого времени
	 * температура понижалась. Определите, в котором часу была впервые отмечена отрицательная температура.
	 * */
	public static void main(String[] args) {
		//тут переиспользовал метод из предыдущей задачи - можно продублировать код из предыдущей задачи
		int[] temp = Task2.generateRandomArray(21, -3, 7);
		for (int i = 8; i <21; i++) {
			if (temp[i] <0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("temp always more than 0");
	}
}
