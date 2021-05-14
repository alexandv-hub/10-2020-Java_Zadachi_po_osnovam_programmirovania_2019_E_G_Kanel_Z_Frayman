package chapter11;

import java.util.Scanner;

public class Task_11_35 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое число и вы­
водит на экран 25 последующих ему нечетных чисел. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Введите целое число (в переменную х)");
		int x = sc.nextInt();

		int s = 0;

		for (int i=x+1; i<(x+51); i++) {
			if (i%2!=0) {
				System.out.println(i + " ");
			s++;
			}
		}
		System.out.println("Выведено - " + s + " раз");
	}

}
