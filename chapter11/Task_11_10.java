package chapter11;

public class Task_11_10 {
	/*
	 * Напишите класс, который выводит на экран (в одну строку) 19 случай­
ных чисел из диапазона «однозначные числа». Каждое значение, рав­
ное О, следует вывести на экран «В окружении» (вплотную к числу, пе­
ред ним и после него) символов«%» (процент). 
	 */

	public static void main(String[] args) {
		for (int i=1; i<=19; i++) {
			int x = 0 + (int) (Math.random()*(9-0+1));
			if (x==0) 
				System.out.println("%" + x + "%");
			else
			System.out.println(x);
		}

	}

}
