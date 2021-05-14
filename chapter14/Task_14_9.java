package chapter14;

public class Task_14_9 {
	/*
	 * Напишите класс, который генерирует 24 целых трехзначных положи­
тельных числа и выводит на экран порядковый номер самого большого 
из сгенерированных чисел.
	 */

	public static void main(String[] args) {

		int num1, num, iMax;

		num1 = 100 + (int) (Math.random()*(999-100+1) );
		System.out.println("Число № 1 - " + num1);
		iMax = 1;

		for (int i=2; i<=24; i++) {
			num = 100 + (int) (Math.random()*(999-100+1) );
			System.out.println("\nЧисло № " + i + " - " + num);

			if (num > num1 ) {
				iMax = i;
				num1 = num;
				System.out.println("iMax = " + iMax);
			}

		}
		System.out.println("\nпорядковый номер самого большого из сгенерированных чисел - " + iMax);
	}

}