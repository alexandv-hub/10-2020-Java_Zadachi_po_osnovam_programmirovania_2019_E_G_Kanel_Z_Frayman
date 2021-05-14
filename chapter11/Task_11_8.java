package chapter11;

public class Task_11_8 {
	/*
	 * Напишите класс, который выводит на экран (в одну строку) 15 случай­
ных чисел из диапазона -20...+35. После каждого отрицательного числа 
следует вывести (вплотную к числу) символ«?» (знак вопроса). 
	 */

	public static void main(String[] args) {

		for (int i=1; i<=15; i++) {
			int x = -20 + (int) (Math.random()*(35+20+1));
			if (x<0) 
				System.out.println(x + "?");
			else
			System.out.println(x);
		}

	}

}