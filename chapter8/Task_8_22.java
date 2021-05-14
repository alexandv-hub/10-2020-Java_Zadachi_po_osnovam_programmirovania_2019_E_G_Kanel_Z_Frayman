package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры целое положитель-
 ное число и изменяет его следующим образом:
 • для четного числа - увеличивает его до ближайшего «круглого» и
 выводит новое значение на экран вместе с сообщением Up to."
 • для нечетного числа - уменьшает его до ближайшего «круглого» и
 выводит новое значение на экран вместе с сообщением Down to".
 Например, для введенного значения 433 на экран выводится Down to
 430, а для 56 выводится Up to 60.
 */

public class Task_8_22 {

	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
		
			System.out.println("Please input a positive integer number");
			int a = sc.nextInt();
			
			if (a%2==0) { 
				a=a/10*10+10;
				System.out.println("Это четное число. Ближайшее круглое число для введенного числа Up to = " + a);
			}
			else {
				a=a/10*10;
				System.out.println("Это нечетное чиcло. Ближайшее круглое число для введенного числа Down to = " + a);
			}
	}

}
