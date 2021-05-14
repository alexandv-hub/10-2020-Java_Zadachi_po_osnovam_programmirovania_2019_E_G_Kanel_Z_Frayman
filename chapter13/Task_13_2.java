package chapter13;

public class Task_13_2 {
	/*
	 * Напишите класс, который генерирует серию из 20 случайных положи­
тельных двузначных чисел и определяет сумму значений в серии. 
	 */

	public static void main(String[] args) {
		
		int a;
		int sFull = 0;
		
		for (int i = 1; i<=20; i++) {
			a = 99-(int)( Math.random() * (99-10+1) );
			System.out.println("a = " + a);
			sFull = sFull + a;
		}
		System.out.println("Сумма чисел в серии = "+ sFull);
	}

}
