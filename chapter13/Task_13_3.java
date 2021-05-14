package chapter13;

public class Task_13_3 {
	/*
	 * Напишите класс, который генерирует серию из 20 случайных положи­
тельных двузначных чисел и определяет сумму четных значений в серии. 
	 */

	public static void main(String[] args) {
		
		int a;
		int sFull = 0;
		
		for (int i = 1; i<=5; i++) {
			a = 99-(int)( Math.random() * (99-10+1) );
			
			if (a%2==0) { 
				System.out.println("a = " + a + " - четное");
				sFull = sFull + a;
			}
			else System.out.println("a = " + a);
		}
		System.out.println("Сумма четных чисел в серии = "+ sFull);
	}

}