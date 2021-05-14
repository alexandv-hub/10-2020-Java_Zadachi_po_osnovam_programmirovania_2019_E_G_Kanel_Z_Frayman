package chapter12;

import java.util.Scanner;

public class Task_12_7 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое число х, а 
затем - серию из 29 дополнительных целых чисел (вводимых с кла­
виатуры). 
Класс должен определить, сколько чисел в серии были равны значению 
переменной х, а сколько - были меньше значения переменной х. 
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int x;
		int countEqual = 0;
		int countSmaller = 0;
		
		System.out.println("Введите целое число x");
		x = sc.nextInt();
		
		for (int i=1; i<=29; i++) {
			System.out.println("Введите дополнительное целое число № " + i);
			int a = sc.nextInt();
			if (x==a) 
				countEqual++;
			if (x<a) 
				countSmaller++;
		}
			System.out.println("Кол-во чисел в серии были равны значению переменной х - " + countEqual);
			System.out.println("Кол-во чисел в серии были меньше значения переменной х - " + countSmaller);		

	}

}
