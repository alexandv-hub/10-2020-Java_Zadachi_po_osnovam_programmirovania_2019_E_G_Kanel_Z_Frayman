package chapter8;

import java.util.Scanner;

/**
 Назовем «степенью четности» числа количество четных цифр в его со­
 ставе (например, степень четности для 2346 равна 3).
 Напишите класс, который принимает с клавиатуры трехзначное поло­
 жительное число и определяет, какова его «степень четности. В соот­
 ветствии с результатом проверки надо вывести на экран соответст­
 вующее текстовое сообщение.
 */

public class Task_8_18 {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input a positive 3-digit number");
		int a = sc.nextInt();
		int a1 = a/100;
		int a2 = (a%100)/10;
		int a3 = a%10;
		int s = 0;
		if (a1%2==0) s++; 
		if (a2%2==0) s++;
		if (a3%2==0) s++;
		System.out.println("Степень четности данного числа = "+ s);
	}

}
