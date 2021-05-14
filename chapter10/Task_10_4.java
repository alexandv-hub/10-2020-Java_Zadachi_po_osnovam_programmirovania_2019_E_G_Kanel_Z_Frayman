package chapter10;

import java.util.Scanner;

public class Task_10_4 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое положитель­
ное число, а затем генерирует три целых положительных числа, мень­
ших первого.
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Please input a pozitive integer number");
		int a = sc.nextInt();

		int a1 = (int) (a*Math.random());
		System.out.println(a1);
		int a2 = (int) (a*Math.random());
		System.out.println(a2);
		int a3 = (int) (a*Math.random());
		System.out.println(a3);

	}

}
