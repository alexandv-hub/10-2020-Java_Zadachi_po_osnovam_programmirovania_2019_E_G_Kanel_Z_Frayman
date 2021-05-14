package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры два целых числа и
 изменяет их следующим образом:
 • при разных значениях, большее число уменьшается на 1, а мень-
 шее - увеличивается на 1;
 • при одинаковых значениях чисел оба увеличиваются на 1.
 Программа должна вывести на экран новые значения переменных.
 */

public class Task_8_23 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the 1st integer number");
		int a = sc.nextInt();
		System.out.println("Please input the 2nd integer number");
		int b = sc.nextInt();

		if (a>b) { 
			a--;
			b++;
			System.out.println(a + ", " + b);
		}
		if (a<b) { 
			b--;
			a++;
			System.out.println(a + ", " + b);
		}
		if (a==b) { 
			a++;
			b++;
			System.out.println(a + ", " + b);
		}

	}
}


