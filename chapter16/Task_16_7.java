package chapter16;

public class Task_16_7 {
	/*
	 * Напишите класс, который будет выводить на экран делители каждого 
числа от 1 до 75. 
	 */

	public static void main(String[] args) {

		int divider;

		for (int i=1; i<=75; i++) {

			for (divider=1; divider<=75; divider++) {
				if (i%divider==0)		
					System.out.println("Делитель числа " + i + " - " + divider);
			}
		} 

	}

}
