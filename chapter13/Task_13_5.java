package chapter13;

import java.util.Scanner;

public class Task_13_5 {
	/*
	 * Назовем «базой» положительного числа Х сумму всех положительных 
целых чисел, меньших Х. 
Напишите класс, который принимает с клавиатуры положительное 
целое число Х и подсчитывает его «базу». 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int X, base=0;
		
		System.out.println("Введите положительное число Х");
		X = sc.nextInt();
		
		for (int i=1; i<=X; i++) {
			base = base + i;
			System.out.println(i);
		}
		System.out.println("«База» положительного числа Х - сумма всех положительных целых чисел, меньших Х = " + base);
	}

}
