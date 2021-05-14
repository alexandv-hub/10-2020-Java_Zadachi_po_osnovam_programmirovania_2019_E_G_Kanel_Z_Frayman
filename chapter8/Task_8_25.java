package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры целое положитель­
 ное число, и затем:
 • в случае если введено четное число, - принимает с клавиатуры
 дробное число и выводит на экран произведение этих двух чисел;
 • в противном случае - принимает с клавиатуры целое число и вы­
 водит на экран сумму этих двух чисел.
 */

public class Task_8_25 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input a positive integer number");
		int a = sc.nextInt();
		double b, c;

		if (a%2==0) {
			System.out.println("Please input a fractional number");
			b = sc.nextDouble();
			c = a*b;
			System.out.println(c);
		}
		else
			System.out.println("Please input an integer number");
		b = sc.nextInt();
		c = a+b;
		System.out.println(c);	
	}

}
