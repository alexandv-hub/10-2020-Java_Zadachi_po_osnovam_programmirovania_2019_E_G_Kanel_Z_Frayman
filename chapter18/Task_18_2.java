package chapter18;

import java.util.Arrays;
import java.util.Scanner;

public class Task_18_2 {
	/*
	В заданиях № 1-8 используется следующее описание массива: 
int n=5; 
int[] а = new int[n]; 

	Укажите, какие значения будет содержать массив, после выполнения 
следующего блока (данные, вводимые с клавиатуры, выберите само­
стоятельно, используйте таблицу трассировки): 

for(i=0; i<n; i++) 
{ x=reader.nextlnt(); a[i]=x%2; }

// Ответ: если ввести x = 5, 10, 8, 7, 1, то массив будет содержать следующие значения - [1, 0, 0, 1, 1].

	 */
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n=5; 
		int[]a = new int[n]; 
		
		for(int i=0; i<n; i++) {
			int x=sc.nextInt(); 
			a[i]=x%2; 
		}
		System.out.println(Arrays.toString(a));

	}

}
