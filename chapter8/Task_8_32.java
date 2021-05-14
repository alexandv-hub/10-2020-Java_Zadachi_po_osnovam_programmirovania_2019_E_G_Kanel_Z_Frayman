package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры целое число, и затем:
 • в случае если введено четное число, - принимает с клавиатуры
 дробное число и выводит на экран произведение этих двух чисел;
 • в противном случае - принимает с клавиатуры целое число и вы-
 водит на экран сумму этих двух чисел.
 */

public class Task_8_32 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please input an integer number");
		int a = sc.nextInt();

		if (a%2==0) {
			System.out.println("Please input a double-type number");
			double c = sc.nextDouble();
			System.out.println(a*c);
		}
		else {
			System.out.println("Please input an integer number");
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
