package chapter18;

import java.util.Arrays;
import java.util.Scanner;

public class Task_18_4 {
	/*
	 	В заданиях № 1-8 используется следующее описание массива: 
int n=5; 
int[] a = new int[n];

	 Укажите, какие значения будет содержать массив, после выполнения 
следующего блока (случайные числа, генерируемые в блоке, выберите 
самостоятельно в соответствии с указанными в команде границами, 
используйте таблицу трассировки): 
for(i=O; i<n; i++) 
{ 
x=(int)(90Math.random()+ 10); 
a(i]=x/10; 
} 

// Ответ: если ввести x = 10, 99, 28, 47, 15, то массив будет содержать следующие значения - [1, 9, 2, 4, 1].
	 */
	public static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		int n=5; 
		int[] a = new int[n];

		for(int i=0; i<n; i++) { 
			int x= sc.nextInt(); 
			// int x = (int)(90*Math.random()+10); - только двузначные числа.
			a[i]=x/10; 
		} 
		System.out.println(Arrays.toString(a));
	}

}
