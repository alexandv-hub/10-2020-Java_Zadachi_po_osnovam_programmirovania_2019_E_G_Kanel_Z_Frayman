package chapter14;

public class Task_14_8 {
	/*
	 * Напишите класс, который генерирует 15 целых положительных трех­
значных чисел и выводит на экран число, сумма цифр которого была 
минимальной. 
	 */

	public static void main(String[] args) {
		
		int num1, num, sum, sumMin, numMin;

		num1 = 100 + (int) (Math.random()*(999-100+1) );
		System.out.println("Число № 1 - " + num1);
		int a1 = num1/100;
		int a2 = num1 % 100 / 10;
		int a3 = num1 % 10;
		sum = a1+a2+a3;
		System.out.println("Сумма чисел = " + sum);
		sumMin = sum;
		numMin = num1;
		
		for (int i=2; i<=15; i++) {
			num = 100 + (int) (Math.random()*(999-100+1) );
			System.out.println("\nЧисло № " + i + " - " + num);
			int n1 = num/100;
			int n2 = num % 100 / 10;
			int n3 = num % 10;
			sum = n1+n2+n3;
			System.out.println("Сумма чисел = " + sum);
			
			if (sumMin > sum ) {
				sumMin=sum;
				numMin = num;
				System.out.println("sumMin = " + sumMin);
			}
			
		}
		System.out.println("\nчисло, сумма цифр которого была минимальной - " + numMin);
	}

}
