package chapter16;

public class Task_16_8 {
	/*
	 * Напишите класс, который будет выводить на экран суммы делителей 
каждого числа от 1 до 75. 
	 */

	public static void main(String[] args) {

		int divider, sumOfDividers;

		for (int i=1; i<=75; i++) {
			sumOfDividers=0;
			for (divider=1; divider<=75; divider++) {
				if (i%divider==0) {
					System.out.println("Делитель числа " + i + " - " + divider);	
					sumOfDividers += divider;
				}

			} 
			System.out.println("Сумма делителей числа " + i + " - " + sumOfDividers);
			System.out.println();
		}
	}
}
