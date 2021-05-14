package chapter9;

import java.util.Scanner;

public class Task_9_15 {
		/*
		 * Напишите класс, который принимает с клавиатуры целое число, кото­
рое должно означать порядковый номер месяца. В случае если полу­
ченное значение действительно соответствует порядковому номеру 
одного из месяцев, следует вывести сезон (лето, осень, зима, весна), к 
которому относится месяц. 
В случае если введенное значение не является порядковым номером ме­
сяца, следует вывести на экран соответствующее текстовое сообщение. 
		 */
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Введите  целое число, которое должно означать порядковый номер месяца");
		int a = sc.nextInt();
		
		boolean spring = (3 <= a) & (a <= 5);
		boolean summer = (6 <= a) & (a <= 8);
		boolean autumn = (9 <= a) & (a <= 11);
		boolean winter = ( ( (1 <= a) & (a <= 2) ) || (12 == a) );
		
		if ( (a<=0) || (a > 12) ) 
			System.out.println("Введен не месяц");
		else {
		if (spring == true)
			System.out.println("Весна");
		if (summer == true)
			System.out.println("Лето");
		if (autumn == true)
			System.out.println("Осень");
		if (winter == true)
			System.out.println("Зима");
		}

	}

}
