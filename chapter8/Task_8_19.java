package chapter8;

import java.util.Scanner;

/**
 Четырехзначное число называется «парно-симметричным», если две
 его первых цифры и две его последних цифры образуют одинаковые
 числа (например - 5252).
 Напишите класс, который принимает с клавиатуры четырехзначное
 положительное число и определяет, является ли оно «парно-сим­
 метричным». В соответствии с результатом проверки надо вывести на
 экран соответствующее текстовое сообщение.
 */

public class Task_8_19 {

 public static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		System.out.println("Please input a positive 4-digit number");
		int a = sc.nextInt();
		int a1 = a/100;
		int a2 = a%100;
		if (a1==a2) 
			System.out.println("Данное число является парно-симметричным");
		else
			System.out.println("Данное число не является парно-симметричным");
	}

}
