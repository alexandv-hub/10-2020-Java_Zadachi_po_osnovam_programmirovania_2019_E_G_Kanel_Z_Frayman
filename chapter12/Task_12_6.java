package chapter12;

import java.util.Scanner;

public class Task_12_6 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое число и про­
веряет, на какое количество двузначных чисел оно делится. 
Результат проверки класс должен вывести на экран вместе с соответст­
вующим текстовым сообщением.
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a;
		int count = 0;
		
		System.out.println("Введите целое число");
		a = sc.nextInt();
		for (int i=10; i<=99; i++) {
			if (a%i==0) {
				count++;
			System.out.println(i);
		}
		}
			System.out.println("Данное число делится на " + count + " двузначных чисел");

	}

}
