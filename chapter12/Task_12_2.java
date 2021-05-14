package chapter12;

import java.util.Scanner;

public class Task_12_2 {
	/*
	 * Напишите класс, который принимает с клавиатуры 15 целых чисел и 
выводит на экран информацию о том, сколько из них были четными и 
сколько нечетными.
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int countEven = 0;
		int countOdd = 0;
		
		for (int i=1; i<=15; i++) {
		System.out.println("Введите целое число № " + i);
		int a = sc.nextInt();
		if (a%2==0) countEven++;
		if (a%2!=0) countOdd++;
		}
		System.out.println("Четных чисел - " + countEven + ", нечетных - " + countOdd);
	}

}
