package chapter18;

import java.util.Scanner;
import java.util.Arrays;

public class Task_18_13 {
	/*
	 Напишите класс, который заполняет случайными четырехзначными 
числами массив, размер которого при инициализации вводится с кла­
виатуры. 
После заполнения класс должен вывести на экран значения массива в 
одной строке, начиная с «конца>> массива (с последней ячейки). 
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Введите размер массива");
		int n = sc.nextInt();
		int []a = new int[n];
		
		for (int i=0; i<n; i++) {
		a[i] = 1000 + (int) ( (9999-1000+1)*Math.random() ); 
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Значения массива начиная с его конца:");
		for (int i=n-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
