package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры два целых числа.
 Класс должен определить, мoгyт ли эти числа быть числителем (пер­
 вое) и знаменателем (второе) дроби.
 В случае если числа выражают неправильную дробь, следует вывести
 на экран соответствующую ей правильную сложную дробь, а во всех
 остальных случаях - текстовое сообщение Подсчет не производится.
 Например, если с клавиатуры введены значения 7 и 12 - на экран вы-
 водится сообщение Подсчет не производится; если введены 12 и 7, то
 на экран выводится 1 5/7.
 */

public class Task_8_30 {

	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			System.out.println("Please input the 1st integer number");
			int a = sc.nextInt();
			System.out.println("Please input the 2nd integer number");
			int b = sc.nextInt();
			
			if ( (b!=0)&&(a>b) ) {
				System.out.println("Это неправильная дробь. Вывод: " + a/b + " " + a%b + "/" + b);
			}
			else
				System.out.println("Подсчет не производится");

	}

}
