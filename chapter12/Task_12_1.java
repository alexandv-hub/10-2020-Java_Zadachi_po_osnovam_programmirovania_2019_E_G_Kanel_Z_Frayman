package chapter12;

import java.util.Scanner;

public class Task_12_1 {
	/*
	 * Напишите класс, который принимает с клавиатуры 10 целых чисел и выво­
дит на экран информацию о том, сколько из них были положительными. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		
		for (int i=1; i<=10; i++) {
		System.out.println("Введите целое число № " + i);
		int n = sc.nextInt();
		if (n>0) count++;
		}
		System.out.println(count);
	}

}
