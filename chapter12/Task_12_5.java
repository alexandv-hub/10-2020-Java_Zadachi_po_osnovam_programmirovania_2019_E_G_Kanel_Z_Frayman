package chapter12;

public class Task_12_5 {
	/*
	 * Напишите класс, который генерирует 15 целых чисел в интервале от 
-25 до 25, печатает их, а затем выводит на экран информацию о том, 
сколько из них были: 

• положительными; 
• четными; 
• однозначными.
	 */

	public static void main(String[] args) {

		int countPositive = 0;
		int countEven = 0;
		int countSingles = 0;
		
		for (int i=1; i<=15; i++) {
			int x = -25+(int) (Math.random()*(25+25+1));
			System.out.println(x);
			if (x>0) countPositive++;
			if (x%2==0) countEven++;
			if ((x<10)&(x>-10)) countSingles++;
		}
		System.out.println("Положительных чисел - " + countPositive);
		System.out.println("Четных чисел - " + countEven);
		System.out.println("Однозначных чисел - " + countSingles);
	}

}
