package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры целое число и вы-
 водит на экран его квадрат, но только в случае, если введенное число
 отрицательно. В противном случае - на экран выводится сообщение
 Ошибка.
 */

public class Task_8_10 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input a number");
		int a = sc.nextInt();

		if (a<0) {
			System.out.println(a*a);
		}
		else
			System.out.println("Ошибка");
	}

}
