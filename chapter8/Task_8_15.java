package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры двузначное поло­
 жительное число и проверяет, какая из его двух цифр является боль­
 шей. В соответствии с результатом проверки надо вывести на экран
 соответствующее текстовое сообщение. Не следует выводить на экран
 никакого сообщения, если число составлено из одинаковых цифр.
 */

public class Task_8_15 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input a positive 2-digit number");
		 int a = sc.nextInt();
		 
		 if (a/10 > a%10)
			 System.out.println("Первая цифра больше второй");
		 if (a/10 < a%10)
			 System.out.println("Вторая цифра больше чем первая");
		 
	}

}
