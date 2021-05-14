package chapter14;

public class Task_14_3 {
	/*
	 * Напишите класс, который генерирует серию из 50 случайных целых 
чисел из диапазона от -40 до +40, и определяет наибольшее и наи­
меньшее значение в сгенерированной серии. 
	 */

	public static void main(String[] args) {

		int num, min, max;

		num = -40 + (int)( Math.random() * (40+40+1) );
		min=num;
		max=num;
		System.out.println("num № 1 = " + num);

		for (int i=2; i<=50; i++) {
			num = -40 + (int)( Math.random() * (40+40+1) );
			System.out.println("\nnum № " + i + " = " + num);

			if (num>max) {
				max=num;
				System.out.println("max = " + max);
			}
			if (num<min) {
				min=num;
				System.out.println("min = " + min);
			}

		}
		System.out.println("\nmax = " + max);
		System.out.println("\nmin = " + min);
	}

}
