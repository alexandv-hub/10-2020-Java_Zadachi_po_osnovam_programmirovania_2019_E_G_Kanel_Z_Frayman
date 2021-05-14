package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры двузначное поло­
жительное число и проверяет, составлено ли оно из одинаковых цифр.
В соответствии с результатом проверки надо вывести на экран соот­
ветствующее текстовое сообщение.
 */

public class Task_8_13 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input a pozitive 2-digit number");
		 int a = sc.nextInt();
		 
		 if (a/10 == a%10)
			 System.out.println("Данное 2-значное число состоит из одинаковых цифр");
		 else
			 System.out.println("Данное 2-значное число состоит из разных цифр");
	}

}
