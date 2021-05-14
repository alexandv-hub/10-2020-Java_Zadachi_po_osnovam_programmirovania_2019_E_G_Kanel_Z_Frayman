package chapter14;

public class Task_14_7 {
	/*
	 * Напишите класс, который генерирует 20 целых положительных дву­
значных чисел и выводит на экран число, сумма цифр которого была 
максимальной.
	 */

	public static void main(String[] args) {

		int num1, num, a1, a2, aSum, numMax, sumMax;

		num1 = 1 + (int) (Math.random()*(99-1+1));
		System.out.println("num №1 = " + num1);
		a1 = num1/10;
		a2 = num1%10;
		aSum = a1+a2;
		System.out.println("Сумма чисел = " + aSum);
		sumMax = aSum;
		numMax = num1;

		for (int i=2; i<=20; i++) {
			num = 1 + (int) (Math.random()*(99-1+1));
			System.out.println("\nnum №" + i + " = " + num);
			a1 = num/10;
			a2 = num%10;
			aSum = a1+a2;
			System.out.println("Сумма чисел = " + aSum);

			if (aSum > sumMax ) {
				numMax = num;
				sumMax = aSum;
				System.out.println("numMax = " + numMax);
				System.out.println("nsumMax = " + sumMax);
			}

			if (i == 20) 
				System.out.println("\nчисло, сумма цифр которого была максимальной - " + numMax);
		}

	}

}
