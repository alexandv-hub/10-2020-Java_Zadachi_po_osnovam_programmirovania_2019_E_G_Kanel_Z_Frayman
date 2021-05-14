package chapter13;

import java.util.Scanner;

public class Task_13_7 {
	/*
	 * Назовем «дважды четным» целое положительное число, если и оно са­
мо, и сумма его делителей - четные числа. 
Напишите класс, который принимает с клавиатуры целое положитель­
ное число и проверяет, является ли оно «дважды четным». 
	 */

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int X, sumOfDividers=0;
		
		System.out.println("Введите целое положительное число");
		X = sc.nextInt();
		
		for (int i=1; i<X; i++) {
			if (X%i==0) {
				System.out.println(i + " - это делитель");
				sumOfDividers = sumOfDividers + i; 
			}
		}
		
		if (sumOfDividers%2==0)
			System.out.println("Данное число является «дважды четным» ");
		else
			System.out.println("Данное число не является «дважды четным» ");
		
	}

}
