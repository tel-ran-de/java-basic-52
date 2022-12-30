package de.telrun.khakov.rustam.homework12;

/**
 * @author Rustam Khakov
 */
public class Task6 {
	/**
	 * 6. Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
	 * значение каждой ячейки массива (пройтись циклом)
	 * значение каждой ячейки всего массива с конца в начало
	 * сумму значений всех ячеек
	 * напечатать кого в массиве больше, четных или нечетных?
	 */
	public static void main(String[] args) {
		int[] arr = Task2.generateRandomArray(100, -100, 100);
		System.out.println("значения: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("с конца в начало способ 1");
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("с конца в начало способ 2");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - i - 1] + " ");
		}
		System.out.println();
		System.out.println("Сумма: ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println("Чет нечет: ");

		int oddCount = 0;
		int evenCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (isOdd(arr[i])) {
				oddCount++;
			} else {
				evenCount++;
			}
		}
		// это тернарый оператор, можно просто if(..) {}else{}
		System.out.println(oddCount>evenCount?"Нечетных больше": "Четных больше");
//		if (oddCount> evenCount) {
//			System.out.println("Нечетных больше");
//		} else {
//			System.out.println("четных больше");
//		}
	}

	public static boolean isOdd(int number) {
		return number % 2 == 1;
	}
}
