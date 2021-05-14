package chapter14;

import java.util.Scanner;

public class Task_14_5 {
	/*
	 * Напишите класс, который принимает с клавиатуры серию из 12 целых 
чисел и определяет среднее арифметическое максимума и минимума 
для этой серии.
	 */

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num, min, max, average;
				
		System.out.println("Please input the 1st number");
		num = sc.nextInt();
		min = num;
		max = num;
		
		for (int i = 2; i <= 12; i++) {
			System.out.println("Please input number № " + i);
			num = sc.nextInt();
			if (num<min) 
				min = num;
			if (num>max) 
				max = num;
		}
		average = (min+max)/2;
		System.out.println("Среднее арифметическое максимума - " + max + ", и минимума - " + min + " равно " + average);

	}

}
