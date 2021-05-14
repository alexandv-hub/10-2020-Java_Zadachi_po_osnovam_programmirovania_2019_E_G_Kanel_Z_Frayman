package chapter13;

import java.util.Scanner;

public class Task_13_17 {
	/*
	 * Последовательность Фибоначчи - последовательность целых чисел, 
построенная по следующему правилу: каждый член последовательно­
сти, начиная с 3-го, равен сумме двух предыдущих. 

Напишите класс, который получает с клавиатуры два первых члена после­
довательности и целое положительное число N. Класс подсчитает и выве­
дет на экран сумму первых N членов последовательности Фибоначчи. 
	 */
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int f1, f2, fNext, N;
		int sumOfN_Members = 0;

		System.out.println("Введите значение первого члена последовательности Фибоначчи");
		f1 = sc.nextInt();
		System.out.println("Введите значение второго члена последовательности Фибоначчи");
		f2 = sc.nextInt();
		System.out.println("Введите значение целого положительного числа N");
		N = sc.nextInt();
		
		System.out.println("Значение 1 члена последовательности = " + f1);
		System.out.println("Значение 2 члена последовательности = " + f2);
		
		sumOfN_Members=f1+f2;
		
		for (int i=3; i<=N; i++) {

			fNext = f1+f2;
			System.out.println("Значение " + i + " члена последовательности = " + fNext);
			sumOfN_Members += fNext;
			f1=f2;
			f2=fNext;
		}
		
		System.out.println("Сумма первых N (" + N + ") членов последовательности Фибоначчи = " + sumOfN_Members);
	}

}
