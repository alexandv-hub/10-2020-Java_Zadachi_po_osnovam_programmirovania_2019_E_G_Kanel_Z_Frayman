package chapter14;

public class Task_14_10 {
	/*
	 * Напишите класс, который генерирует 25 целых положительных трех­
значных чисел и выводит на экран порядковый номер числа, сумма 
цифр которого была максимальной.
	 */

	public static void main(String[] args) {

		int num1, num, a1, a2, a3, n1, n2, n3, sumMax, sumMaxN, numSumMax;

		num1 = 100+(int) ( Math.random()*(999-100+1) );
		System.out.println("Число № 1 - " + num1);
		a1 = num1 / 100;
		a2 = num1 % 100/10;
		a3 = num1 % 10;
		sumMax = a1 + a2 + a3;
		System.out.println("Сумма цифр числа - " + sumMax);
		numSumMax = 1;
		

		for (int i = 2; i<=25; i++) {
			num = 100+(int) ( Math.random()*(999-100+1) );
			System.out.println("\nЧисло № " + i + " - " + num);
			n1 = num / 100;
			n2 = num % 100/10;
			n3 = num % 10;
			sumMaxN = n1 + n2 + n3; 
			System.out.println("Сумма цифр числа - " + sumMaxN);

			if (sumMaxN > sumMax) {
				sumMax = sumMaxN;
				numSumMax = i;
				System.out.println("Порядковый номер числа - " + numSumMax);
			}

		}
		System.out.println("\nпорядковый номер числа, сумма цифр которого была максимальной - " + numSumMax );

	}

}
