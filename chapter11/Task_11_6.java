package chapter11;

import java.util.Scanner;

public class Task_11_6 {
	/*
	 * Напишите класс, который выполняет следующие действия: 
1. Принимает с клавиатуры два целых числа. 
2. Создает и выводит на экран 20 случайных чисел в диапазоне от 
первого, только что введенного с клавиатуры, значения, - до вто­
рого значения, также введенного с клавиатуры перед этим. Мож­
но исходить из предположения, что первое из вводимых чисел 
всегда меньше второго. 
Например, если с клавиатуры были введены значения -8 и 17, то класс 
создает 20 случайных чисел в диапазоне от -8 до 17 (включая сами эти 
значения). 
	 */

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please input the 1st integer number");
		int a = sc.nextInt();
		System.out.println("Please input the 2nd integer number");
		int b = sc.nextInt();
		
		int s = 0;
		
		for (int i=1; i<=20; i++) {
			int x = a + (int) (Math.random()*(b-a+1));
			System.out.println(x);
			s++;
		}
		System.out.println("Кол-во повторов = " + s);
	}

}
