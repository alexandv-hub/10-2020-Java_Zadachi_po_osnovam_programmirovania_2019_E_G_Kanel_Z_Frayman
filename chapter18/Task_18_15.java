package chapter18;

import java.util.Arrays;
import java.util.Scanner;

public class Task_18_15 {
	/*
	 Напишите класс, который заполняет случайными двузначными числами 
массив, размер которого при инициализации вводится с клавиатуры. 
После заполнения класс должен вывести на экран значения массива 
следующим образом: 
• в первой строке - значения из четных ячеек массива; 
• во второй строке - значения из нечетных ячеек массива. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int n;
		System.out.println("Введите размер массива");
		n = sc.nextInt();
		int []a = new int[n];
		
		for (int i=0; i<=(n-1); i++) {
		a[i] = 10 + (int) ( (99-10+1)*Math.random() ); 
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.print("Значения четных ячеек массива: ");
		for (int i=1; i<a.length; i++) {
			if ( (i-1)%2==0 )
				System.out.print(a[i] + ", ");
		}
		
		System.out.print("\nЗначения нечетных ячеек массива: ");
		for (int i=0; i<a.length; i++) {
			if ( ((i-1)%2!=0) || (i==0) ) 
				System.out.print(a[i] + ", ");
		}
		
	}

}
