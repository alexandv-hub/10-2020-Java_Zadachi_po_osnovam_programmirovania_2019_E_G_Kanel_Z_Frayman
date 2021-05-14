package chapter12;

public class Task_12_9 {
	/*
	 * Определим как «красивое» целое положительное трехзначное число Х, 
для которого выполняется следующее условие: сумма квадратов пер­
вой и последней цифр равна квадрату средней цифры. 
Напишите класс, который выводит на экран все «красивые» числа и их 
количество.
	 */

	public static void main(String[] args) {

		int X;
		int count = 0; 
		for (int i=100; i<=999; i++) {
			X = 999-(int)((999-100+1)*Math.random());
			int X1 = X/100;
			int X2 = X%100/10;
			int X3 = X%10;
			if ( (Math.pow(X1, 2) + Math.pow(X3, 2)) == Math.pow(X2, 2) ) { 
				count++;
				System.out.println(X);
			}
		}
		System.out.println("Кол-во всех «красивых» чисел - " + count);
	}

}
