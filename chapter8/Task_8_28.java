package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры два целых положи-
 тельных числа. Класс должен определить, могут ли эти числа быть чис-
 лителем (первое) и знаменателем (второе) дроби.
 В случае если могут, класс должен определить, является ли эта дробь
 правильной, неправильной или же она выражает целое число, а также
 вывести на экран соответствующее текстовое сообщение.
 В случае если числа не могут выражать дробь, следует вывести на экран
 соответствующее объяснение.
 */

public class Task_8_28 {

	public static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			System.out.println("Please input the 1st positive integer number");
			int a = sc.nextInt();
			System.out.println("Please input the 2nd positive integer number");
			int b = sc.nextInt();
			double c = (double)a/b;
			
			if (b!=0) {
				if (a>=b)
					System.out.println(a + " / " + b + " - is a proper fraction");
				if (a<b)
					System.out.println(a + " / " + b + " - is an incorrect fraction");
				if (c%1==0)
					System.out.println("A fraction expresses a whole number");
			}
			else
				System.out.println("Ошибка. Деление на ноль!");

	}

}
