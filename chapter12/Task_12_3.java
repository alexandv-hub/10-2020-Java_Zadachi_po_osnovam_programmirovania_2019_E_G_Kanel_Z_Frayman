package chapter12;

import java.util.Scanner;

public class Task_12_3 {
	/*
	 * Напишите класс, который принимает с клавиатуры 12 целых чисел и 
выводит на экран информацию о том, сколько из них были больше, 
чем первое число. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int count = 0;
		
		System.out.println("Введите целое число № 1");
		int theFirst = sc.nextInt();
		
		for (int i=2; i<=12; i++) {
		System.out.println("Введите целое число № " + i);
		int a = sc.nextInt();
		if (a> theFirst) count++;
		}
		System.out.println("Из введенных 12ти чисел, " + count + " были больше первого введенного");
	}

}
