package chapter8;

import java.util.Scanner;

/**
 *
 Напишите класс, который принимает с клавиатуры трехзначное число
 и изменяет его следующим образом:
 • для четных чисел - все четные цифры увеличиваются на 1, а не-
 четные уменьшаются на 1; в случае если это невозможно, они ос-
 таются неизменными;
 • в нечетных числах все изменения производятся «наоборот».
 Программа должна вывести на экран новое значение переменной.
 */

public class Task_8_31 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input 3-digit integer number");
		int a = sc.nextInt();

		int a1 = a/100;
		int a2 = a%100/10;
		int a3 = a%10;

		if (a%2==0) {

			if (a1 != 0) {
				if (a1%2 == 0) 
					a1++;
				else 
					a1--;
			}

			if (a2 != 0) {
				if (a2%2 == 0)
					a2++;
				else 
					a2--;
			}

			if (a3 != 0) {
				if (a3%2 == 0) 
					a3++;
				else 
					a3--;
			}

		System.out.println(a1*100 + a2*10 + a3);
		}
		else {
			if (a1 != 0) {
				if (a1%2 == 0)  
					a1--;
				else 
					a1++;
			}

			if (a2 != 0) {
				if (a2%2 == 0)  
					a2--;
				else 
					a2++;
			}

			if (a3 != 0) {
				if (a3%2 == 0) 
					a3--;
				else 
					a3++;
			}

		System.out.println(a1*100 + a2*10 + a3);
		}
	}
}
