package chapter13;

import java.util.Scanner;

public class Task_13_6 {
	/*
	 * Определим как «удивительное» целое положительное число Х, для ко­
торого выполняется следующее условие: сумма всех целых положи­
тельных чисел, меньших Х и являющихся делителями Х, равно Х. 
Например, число 28 является «удивительным», потому что 
1+2+4 + 7 + 14 = 28. 
Напишите класс, который принимает в качестве параметра целое по­
ложительное число, проверяет, является ли оно «удивительным», и вы­
водит на экран соответствующее текстовое сообщение. 
	 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int X;
		int sumOfDividers = 0;
		
		System.out.println("Введите целое положительное число Х");
		X = sc.nextInt();
		
		for (int i=1; i<X; i++) {
			if (X%i==0) {
				System.out.println(i + " - делитель");
				sumOfDividers = sumOfDividers + i;
			}
		}
		if (sumOfDividers == X)		
		System.out.println("Данное число является «удивительным»");
		else
		System.out.println("Данное число не является «удивительным»");
	}

}
