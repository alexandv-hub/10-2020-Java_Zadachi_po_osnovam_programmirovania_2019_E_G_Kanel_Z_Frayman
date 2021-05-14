package chapter16;

public class Task_16_4 {
	/*
	 * Напишите класс, который выводит на экран построчно таблицу умно­
жения: в первой строке -умножение чисел от 1 до 9 на 1, во второй -
умножение на 2, и так далее до умножения чисел от 1 до 9 на 12.
	 */

	public static void main(String[] args) {

		for (int j=1; j<=9; j++) {
			for (int i=1; i<=9; i++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}

}
