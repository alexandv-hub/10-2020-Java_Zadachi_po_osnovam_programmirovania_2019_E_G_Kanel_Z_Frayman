package chapter11;

public class Task_11_9 {
	/*
	 * Напишите класс, который выводит на экран (в одну строку) 20 случайных 
чисел из диапазона 27...73. Перед каждым значением, делящимся на 3 
без остатка, следует вывести (вплотную к числу) символ «#» (решетка). 
	 */

	public static void main(String[] args) {
		for (int i=1; i<=20; i++) {
			int x = 27 + (int) (Math.random()*(73-27+1));
			if (x%3==0) 
				System.out.println(x + "#");
			else
			System.out.println(x);
		}
	}

}
