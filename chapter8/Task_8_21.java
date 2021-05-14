package chapter8;

import java.util.Scanner;

/**
 Напишите класс, который принимает с клавиатуры положительное
 целое число и выводит на экран ближайшее к нему «круглое число».
 Например, для введенного значения 433 выводится на экран 430, а для
 56 выводится 60.
 */

public class Task_8_21 {

	public static Scanner sc = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			System.out.println("Please input a number");
			int a = sc.nextInt();
			int a1 = a%10;
			if (a1<=5) 
				System.out.println("Ближайшее круглое число для введенного числа = " + (a/10*10) );
			else 
				System.out.println("Ближайшее круглое число для введенного числа = " + (a/10+1)*10 );
	}

}
