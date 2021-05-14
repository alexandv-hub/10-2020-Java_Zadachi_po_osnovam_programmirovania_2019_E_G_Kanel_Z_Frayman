package chapter14;

public class Task_14_6 {
	/*
	 * Напишите класс, который принимает с клавиатуры серию из 27 целых 
чисел и сравнивает два значения: среднее арифметическое максимума 
и минимума, и среднее арифметическое всех значений серии.
	 */

	public static void main(String[] args) {

		int num, min, max; 
		int sum=0;
		double average, averageTotal;
		int num1 = 1 + (int)(Math.random()*(99-1+1));
		System.out.println("\nnum 1 = " + num1);
		min = num1;
		max = num1;
		sum = num1;

		for (int i = 2; i <= 27; i++ ) {
			num = 1 + (int)(Math.random()*(99-1+1));
			sum += num;
			num1=num;

			System.out.println("\nnum " + i + " = " + num);
			System.out.println("\nsum " + " = " + sum);

			if (num < min) {
				min = num;
				System.out.println("min = " + min);
			}
			if (num > max) {
				max = num;
				System.out.println("max = " + max);	
			}

			if (i==27) {
				average = (min+max)/2d;
				averageTotal = (sum/4d);
				System.out.println("\nсреднее арифметическое максимума (" + max + ") и минимума (" + min + ") = " + average);
				System.out.println("среднее арифметическое всех значений серии = sum (" + sum + ") /27  = " + averageTotal);
			}

		}

	}		

}


