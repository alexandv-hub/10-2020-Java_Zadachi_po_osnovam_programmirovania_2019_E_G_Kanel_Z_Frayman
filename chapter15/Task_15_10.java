package chapter15;

import java.util.Scanner;

public class Task_15_10 {
	/*
	 * Напишите класс, который принимает с клавиатуры число для пере­
менной Х, а затем дополнительную серию чисел, каждое из которых 
используется для уменьшения значения переменной Х. Ввод чисел 
должен производиться до тех пор, пока значение переменной Х оста­
ется положительным. 
	 */
public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int X, a;
		System.out.println("Введите значение числа X");
		
		X = sc.nextInt();
		
		while (X>0) {
			System.out.println("Введите значение декремента");
			a = sc.nextInt();
			X -= a;
			System.out.println("X = " + X);
		}

	}

}
