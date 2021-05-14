package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры двузначное поло­
 жительное число и проверяет, является ли в нем первая цифра (десят­
 ков) больше второй (единиц). В соответствии с результатом проверки
 надо вывести на экран соответствующее текстовое сообщение.
 */

public class Task_8_14 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input a positive 2-digit number");
		 int a = sc.nextInt();
		 
		 if (a/10 > a%10)
			 System.out.println("Десятков больше чем едениц");
		 if (a/10 < a%10)
			 System.out.println("Десятков меньше чем едениц");
		 if (a/10 == a%10)
			 System.out.println("Десятков и едениц одинаково");

	}

}
