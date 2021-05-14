package chapter12;

import java.util.Scanner;

public class Task_12_15 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое положитель­
ное число Х и выводит на экран все его делители (1 и само число Х 
не считать делителями). 
Класс должен также подсчитать количество этих делителей и вывести 
результат на экран вместе с соответствующим по смыслу текстовым 
сообщением. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int X;
		int count = 0;
		
		System.out.println("Введите целое положительное число Х");
		X = sc.nextInt();
		for (int i=2; i<X; i++) {
			if (X%i==0) {
				count++;
				System.out.println(i);
			}
			
		}
			System.out.println("Кол-во всех делителей числа X - " + count);
		
	}

}
