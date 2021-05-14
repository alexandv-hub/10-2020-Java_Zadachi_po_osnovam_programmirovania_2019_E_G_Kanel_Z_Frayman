package chapter8;

import java.util.Scanner;

public class Task_8_17 {
	/**
	 Трехзначное число называется «дважды четным», если и оно само, и
сумма его цифр - четные. 
Напишите класс, который принимает с клавиатуры трехзначное поло-
жительное число и проверяет, является ли оно «дважды четным». 
В соответствии с результатом проверки надо вывести на экран соот­
ветствующее текстовое сообщение. 
Обратите внимание: задание имеет решение с использованием единст­
венного оператора if- без составного условия! 
	 */
	
	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			System.out.println("Please input a positive 3-digit number");
			 int a = sc.nextInt();
			 int a1 = a/100;
			 int a2 = a%100;
			 int a3 = a%10;
			 int s = a1+a2+a3;
			 if ((a%2 == 0)&(s%2==0)) 
				 System.out.println("Данное число является «дважды четным»");
			 else 
				 System.out.println("Данное число не является «дважды четным»");
	}

}
