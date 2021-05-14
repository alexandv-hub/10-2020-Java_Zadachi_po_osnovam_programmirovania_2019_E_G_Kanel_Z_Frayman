package chapter17;

import java.util.Scanner;

public class Task_17_9 {
	/*
	 * Напишите метод, который получает в качестве параметра два числа 
(А и В) и выводит на экран все четные числа из диапазона А ... В. 
	 */

	public static Scanner sc = new Scanner(System.in);

	static void method (int a, int b) {

		for (int i=a+1; i<b; i++) {
			if (i%2==0) 
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		method(2,10);
	}

}
