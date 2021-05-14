package chapter18;

import java.util.Arrays;
import java.util.Scanner;

public class Task_18_3 {
	/*
	В заданиях № 1-8 используется следующее описание массива: 
int n=5; 
int[] a = new int[n];

	Укажите, какие значения будет содержать массив, после выполнения 
следующего блока (данные, вводимые с клавиатуры, выберите само­
Состоятельно, используйте таблицу трассировки): 

for(i=l; i<n; i++) 
{ x=reader.nextlnt(); a[i]=x%i; } 

// Ответ: если ввести x = 5, 10, 8, 7, 1, то массив будет содержать следующие значения - [0, 0, 0, 2, 3].
	 */

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n=5; 
		int []a = new int[n];

		for(int i=1; i<n; i++) {
			int x=sc.nextInt(); 
			a[i]=x%i; 
		} 
		System.out.println(Arrays.toString(a));
	}

}
