package chapter11;

import java.util.Scanner;

public class Task_11_55 {
	/*
	 * Напишите класс, который принимает с клавиатуры два целых положи­
тельных числа: N и М (неизвестно, какое из введенных чисел больше). 
Класс должен вывести на экран все четные числа между наименьшим и 
наибольшим значениями, введенными с клавиатуры.
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Введите целое положительное число N");
		int n = sc.nextInt();
		System.out.println("Введите целое положительное число M");
		int m = sc.nextInt();

		if (n>m) {
			for (int i=m+1; i<n; i++) {
				if (i%2==0)
					System.out.println(i + "");
			}
		}
		if (n<m) {
			for (int i=n+1; i<m; i++) {
				if (i%2==0)
					System.out.println(i + "");
			}

		}
	}
}
