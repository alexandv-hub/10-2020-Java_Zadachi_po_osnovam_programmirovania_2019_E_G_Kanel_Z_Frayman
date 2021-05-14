package chapter11;

import java.util.Scanner;

public class Task_11_30 {
	/*
	 * Напишите класс, который вначале принимает с клавиатуры целое по­
ложительное число. 
Затем класс выводит на экран в строку положительные двузначные 
числа, произведение цифр которых меньше введенного с клавиатуры 
значения. Числа должны отделяться друг от друга знаком «пробел». 
Перед началом и после окончания вывода серии чисел на экран вывода 
следует вывести текстовые сообщения (по выбору). 
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Введите целое положительное число (в переменную х)");
		int x = sc.nextInt();

		System.out.println("По выбору");

		for (int i=10; i<=99; i++) {
			int i1 = i/10; 
			int i2 = i%10;
			if ((i1*i2)<x)
				System.out.print(i + " ");
		}
		System.out.println("\nПо выбору");

	}

}
