package chapter11;

import java.util.Scanner;

public class Task_11_60 {
	/*
	 * Напишите класс, который принимает с клавиатуры целое число N, 
а затем выводит на экран все степени двойки от 1 до N включительно. 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Введите целое положительное число N");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print((int)Math.pow(2, i) +" ");
		}
	}

}
