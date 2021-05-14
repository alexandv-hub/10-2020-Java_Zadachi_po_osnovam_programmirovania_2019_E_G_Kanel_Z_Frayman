package chapter13;

import java.util.Scanner;

public class Task_13_8 {
	/*
	 * Назовем «дважды делимым» целое положительное число, если и оно 
само, и сумма его делителей - делятся (без остатка, разумеется) на 
количество делителей числа. 
Напишите класс, который принимает с клавиатуры целое положитель­
ное число и проверяет, является ли оно· «дважды делимым». 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a, numOfDividers=0, sumOfDividers=0;
		
		System.out.println("Введите целое положительное число");
		a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			if (a%i==0) {
				System.out.println(i + " - делитель");
				numOfDividers++;
				sumOfDividers = sumOfDividers + i;
				System.out.println("Сумма делителей = " + sumOfDividers);
			}	
		}
		System.out.println("Итого: Кол-во делителей = " + numOfDividers);
		System.out.println("Итого: Сумма делителей = " + sumOfDividers);
		

		
		if ( (a%numOfDividers==0) & (sumOfDividers%numOfDividers==0) )
			System.out.println("Данное число является «дважды делимым», потому что " + a + " делится на " + numOfDividers + 
					", и " + sumOfDividers + " делится на " + numOfDividers + " без остатка");
		else
			System.out.println("Данное число не является «дважды делимым»");
	}

}
