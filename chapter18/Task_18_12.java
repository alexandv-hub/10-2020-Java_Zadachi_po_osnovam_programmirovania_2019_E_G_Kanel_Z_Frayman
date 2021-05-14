package chapter18;

import java.util.Arrays;
import java.util.Scanner;

public class Task_18_12 {
	/*
	 * Напишите класс, который заполняет случайными трехзначными чис­
лами массив, размер которого при инициализации вводится с кла­
виатуры. 
После заполнения класс должен вывести на экран значения массива в 
одной строке, начиная с «начала» массива (с первой ячейки). 
	 */
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Введите размер массива");
		int n = sc.nextInt();
		int []a = new int[n];
		
		for (int i=0; i<n; i++) {
		a[i] = 100 + (int)( (999-100+1)*Math.random() ); 
		}
		
		System.out.println(Arrays.toString(a));
	}
}
