package chapter8;

import java.util.Scanner;

/**
 Трехзначное число называется «симметричным», если первая и по­
 следняя его цифры одинаковы.
 Напишите класс, который принимает с клавиатуры трехзначное поло­
 жительное число и проверяет, является ли оно «симметричным». В со­
 ответствии с результатом проверки надо вывести на экран соответст­
 вующее текстовое сообщение.
 */

public class Task_8_16 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please input a positive 3-digit number");
		 int a = sc.nextInt();
		 
		 if (a/100 == a%10)
			 System.out.println("Данное число является «симметричным»");
		 else 
			 System.out.println("Данное число не является «симметричным»");
	}

}
