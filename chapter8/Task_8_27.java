package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает в качестве параметров два целых
 положительных числа и выводит на экран с дополнительным сообще-
 нием то из них, у которого наибольшая последняя цифра (число еди-
 ниц). Если такого числа нет, класс должен вывести на экран соответст-
 вующее сообщение.
 */

public class Task_8_27 {

	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			System.out.println("Please input a positive integer number");
			int a = sc.nextInt();
			System.out.println("Please input a positive integer number");
			int b = sc.nextInt();
			int a1 = a%10;			
			int b1 = b%10;
			
			if (a1!=b1) {
				if (a1>b1)
					System.out.println(a);
				if (a1<b1)
					System.out.println(b);
			}
			else
				System.out.println("Данные числа равны");
	}

}
