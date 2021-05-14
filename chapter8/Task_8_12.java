package chapter8;

import java.util.Scanner;

	/**
Напишите класс, который принимает с клавиатуры оценку ученика
(целое число) и проверяет, не является ли введенное значение оши-
бочным.
На экран должно выводиться соответствующее текстовое сообщение.
	 */

public class Task_8_12 {
	
	public static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			 System.out.println("Please input a mark o the student");
			 int a = sc.nextInt();
			 
			 if (a==1||a==2||a==3||a==4||a==5)
				 System.out.println("Данное значение не является ошибочным");
			 else
				 System.out.println("Данное значение является ошибочным");
	}

}
