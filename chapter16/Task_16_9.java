package chapter16;

import java.util.Scanner;

public class Task_16_9 {
	/*
	 * Напишите класс для графического изображения делимости чисел 
от 1 до n (значение переменной n вводится с клавиатуры). В каждой 
строке надо вывести число и столько плюсов, сколько делителей у это­
го числа (считая и единицу, и само число). Например, если исходное 
данное - число 4, то на экран должно быть выведено: 
1+ 
2++ 
3++ 
4+++ 
	 */
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n, 	divider;

		System.out.println("Введите значение числа n");
		n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.print(i);
			
			for (divider=1; divider<=n; divider++) {
				
				if (i%divider==0) {
					System.out.print("+");	
				}
			}
			System.out.println();
		}
	} 
}




