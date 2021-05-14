package chapter13;

import java.util.Scanner;

public class Task_13_9 {
	/*
	 * Два положительных целых числа называются «четно-близкими по 
сумме», если сумма их общих делителей является четным числом. 
Напишите класс, который принимает с клавиатуры два целых поло­
жительных числа и проверяет, являются ли они «четно-близкими по 
сумме».
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a, b, sumOfCommonDividers=0;

		System.out.println("Введите первое целое положительное число");
		a = sc.nextInt();
		System.out.println("Введите второе целое положительное число");
		b = sc.nextInt();
		
		if (a==b)
			System.out.println("Данные 2 числа равны");
		else {

		// найти общие делители чисел a и b 		
		if (a>b) {
			for (int i=1; i<=a; i++) {
				if ( (a%i==0) & (b%i==0) ) {
					System.out.println(i + " - общий делитель a и b");
					sumOfCommonDividers += i;
				}
			}
		}

		if (a<b) {
			for (int i=1; i<=b; i++) {
				if ( (a%i==0) & (b%i==0) ) {
					System.out.println(i + " - общий делитель a и b");
					sumOfCommonDividers += i;
				}
			}
		}
		
		System.out.println("Сумма общих делителей = " + sumOfCommonDividers);
		
		if (sumOfCommonDividers%2 == 0)
			System.out.println("Данные 2 числа являются «четно-близкими по сумме»");
		if (sumOfCommonDividers%2 != 0)
			System.out.println("Данные 2 числа не являются «четно-близкими по сумме»");
		
		}

	}

}
